import java.awt.*; // makes window layouts and colors.
import java.awt.event.*; // lets buttons and mouse clicks work.
import java.io.BufferedWriter; // writes text fast to a file.
import java.io.FileWriter; // opens or creates a file to write in.
import java.io.IOException; // catches file writing errors.
import java.nio.charset.StandardCharsets; // keeps text in UTF-8 format.
import java.security.*; // for making keys and hashes.
import java.time.LocalDateTime; // gives the current date and time.
import java.util.Base64; // turns text to/from Base64 code.
import java.util.regex.Pattern; // checks if text matches a rule (like hex or binary).
import javax.crypto.Cipher; // does the encrypt/decrypt work.
import javax.crypto.spec.SecretKeySpec; // helps AES use the key.
import javax.swing.*; // builds the window and buttons.
import javax.swing.table.DefaultTableModel; // stores data for the table.

// CLASS - public class CryptoTool extends JFrame: CryptoTool=main class, holds all gui code, enc-dec methods and logics
public class CryptoTool extends JFrame {

    // UI State (encapsulated as private fields)
    private JTextField inputField, keyField; // User text + optional key
    private JComboBox<String> methodCombo; // Algorithm selector
    private JTextArea resultArea; // Outputs & errors
    private JTable historyTable; // Small history table
    private DefaultTableModel tableModel; // Backing model for history

    // Crypto State
    private KeyPair rsaKeyPair; // Demo RSA keypair (per run)

    /**
     * Constructor: builds the window, widgets, and generates an RSA keypair.
     */
    public CryptoTool() {
        // --- Create an RSA key pair for this session ---
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            rsaKeyPair = keyGen.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        // --- Window basics ---
        setTitle("Cryptographic Encrypt-Decrypt Tool");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // --- Top input panel: fields + buttons ---
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        JLabel inputLabel = new JLabel("Input Text:");
        inputField = new JTextField(20);
        JLabel keyLabel = new JLabel("Key (if required):");
        keyField = new JTextField(20);
        JLabel methodLabel = new JLabel("Crypto Method:");
        methodCombo = new JComboBox<>(
            new String[] {
                "Base64",
                "Caesar Cipher",
                "XOR",
                "ROT13",
                "ROT47",
                "Hex",
                "Binary-ASCII",
                "RSA",
                "SHA-256",
                "MD5",
                "Vigenère",
                "AES",
            }
        );
        JButton encryptButton = new JButton("Encrypt");
        JButton decryptButton = new JButton("Decrypt");
        JButton clearButton = new JButton("Clear Results");
        JLabel disclaimerLabel = new JLabel(
            "<html><b>Ethical Use:</b> For educational purposes only.</html>"
        );

        // Lay out inputs
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(keyLabel);
        inputPanel.add(keyField);
        inputPanel.add(methodLabel);
        inputPanel.add(methodCombo);
        inputPanel.add(encryptButton);
        inputPanel.add(decryptButton);
        inputPanel.add(clearButton);
        inputPanel.add(disclaimerLabel);

        // --- Center: larger result area with a basic copy/paste context menu ---
        resultArea = new JTextArea(15, 50);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        resultArea.setEditable(true); // allow user to copy output
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        JScrollPane resultScroll = new JScrollPane(resultArea);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        copyItem.addActionListener(e -> resultArea.copy());
        pasteItem.addActionListener(e -> inputField.paste());
        popupMenu.add(copyItem);
        popupMenu.add(pasteItem);
        resultArea.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.isPopupTrigger()) popupMenu.show(
                        resultArea,
                        e.getX(),
                        e.getY()
                    );
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (e.isPopupTrigger()) popupMenu.show(
                        resultArea,
                        e.getX(),
                        e.getY()
                    );
                }
            }
        );

        // --- Bottom: small history table ---
        String[] columns = { "Operation", "Input", "Output", "Timestamp" };
        tableModel = new DefaultTableModel(columns, 0);
        historyTable = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(historyTable);
        tableScroll.setPreferredSize(new Dimension(700, 150));

        // Add major sections to root panel
        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(resultScroll, BorderLayout.CENTER);
        panel.add(tableScroll, BorderLayout.SOUTH);
        add(panel);

        // --- Button events ---
        encryptButton.addActionListener(e -> processOperation("Encrypt"));
        decryptButton.addActionListener(e -> processOperation("Decrypt"));
        clearButton.addActionListener(e -> resultArea.setText(""));
    }

    /**
     * Runs when the user clicks Encrypt/Decrypt.
     * Validates input, chooses the method, performs the operation, updates UI and log.
     */
    private void processOperation(String operation) {
        String input = inputField.getText().trim();
        String key = keyField.getText().trim();
        String method = (String) methodCombo.getSelectedItem();

        if (input.isEmpty()) {
            resultArea.append("Please enter input text.\n");
            return;
        }

        try {
            String output = "";

            if (method.equals("Base64")) {
                output = operation.equals("Encrypt")
                    ? base64Encode(input)
                    : base64Decode(input);
            } else if (method.equals("Caesar Cipher")) {
                if (key.isEmpty()) throw new IllegalArgumentException(
                    "Key required (1-25)."
                );
                int shift = Integer.parseInt(key);
                output = operation.equals("Encrypt")
                    ? caesarCipher(input, shift)
                    : caesarCipher(input, -shift);
            } else if (method.equals("XOR")) {
                if (
                    key.isEmpty() || key.length() != 1
                ) throw new IllegalArgumentException(
                    "Single character key required."
                );
                output = xorCipher(input, key.charAt(0));
            } else if (method.equals("ROT13")) {
                output = caesarCipher(
                    input,
                    operation.equals("Encrypt") ? 13 : -13
                );
            } else if (method.equals("ROT47")) {
                output = rot47Cipher(input);
            } else if (method.equals("Hex")) {
                output = operation.equals("Encrypt")
                    ? toHex(input)
                    : fromHex(input);
            } else if (method.equals("Binary-ASCII")) {
                output = operation.equals("Encrypt")
                    ? toBinary(input)
                    : fromBinary(input);
            } else if (method.equals("RSA")) {
                output = operation.equals("Encrypt")
                    ? rsaEncrypt(input)
                    : rsaDecrypt(input);
            } else if (method.equals("SHA-256")) {
                if (
                    operation.equals("Decrypt")
                ) throw new IllegalArgumentException(
                    "SHA-256 is one-way (no decryption)."
                );
                output = sha256Hash(input);
            } else if (method.equals("MD5")) {
                if (
                    operation.equals("Decrypt")
                ) throw new IllegalArgumentException(
                    "MD5 is one-way (no decryption)."
                );
                output = md5Hash(input);
            } else if (method.equals("Vigenère")) {
                if (key.isEmpty()) throw new IllegalArgumentException(
                    "Keyword required."
                );
                output = operation.equals("Encrypt")
                    ? vigenereCipher(input, key, true)
                    : vigenereCipher(input, key, false);
            } else if (method.equals("AES")) {
                if (key.length() != 16) throw new IllegalArgumentException(
                    "AES key must be 16 characters."
                );
                output = operation.equals("Encrypt")
                    ? aesEncrypt(input, key)
                    : aesDecrypt(input, key);
            }

            // Output + record keeping
            resultArea.append(
                "[" +
                    LocalDateTime.now() +
                    "] " +
                    operation +
                    " (" +
                    method +
                    "): " +
                    output +
                    "\n\n"
            );
            tableModel.addRow(
                new Object[] {
                    operation + " (" + method + ")",
                    input,
                    output,
                    LocalDateTime.now(),
                }
            );
            logToFile(
                operation +
                    " (" +
                    method +
                    "): Input=" +
                    input +
                    ", Output=" +
                    output +
                    "\n"
            );
        } catch (Exception ex) {
            // Show clean error messages to the user
            resultArea.append("Error: " + ex.getMessage() + "\n\n");
        }
    }

    // ======== Encoding / cipher helpers (kept private to encapsulate details) ========

    private String base64Encode(String input) {
        return Base64.getEncoder().encodeToString(
            input.getBytes(StandardCharsets.UTF_8)
        );
    }

    private String base64Decode(String input) {
        return new String(
            Base64.getDecoder().decode(input),
            StandardCharsets.UTF_8
        );
    }

    private String caesarCipher(String input, int shift) {
        StringBuilder result = new StringBuilder();
        shift = ((shift % 26) + 26) % 26; // normalize shift to [0,25]
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) (base + ((c - base + shift) % 26)));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private String xorCipher(String input, char key) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append((char) (c ^ key));
        }
        return result.toString();
    }

    private String rot47Cipher(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c >= 33 && c <= 126) {
                result.append((char) (33 + ((c + 14) % 94))); // basic ROT47 mapping
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private String toHex(String input) {
        StringBuilder hex = new StringBuilder();
        for (char c : input.toCharArray()) {
            hex.append(String.format("%02X", (int) c));
        }
        return hex.toString();
    }

    private String fromHex(String input) {
        if (
            !Pattern.matches("[0-9A-Fa-f]+", input) || input.length() % 2 != 0
        ) {
            throw new IllegalArgumentException("Invalid hex string.");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            result.append(
                (char) Integer.parseInt(input.substring(i, i + 2), 16)
            );
        }
        return result.toString();
    }

    private String toBinary(String input) {
        StringBuilder binary = new StringBuilder();
        for (char c : input.toCharArray()) {
            binary
                .append(
                    String.format("%8s", Integer.toBinaryString(c)).replace(
                        ' ',
                        '0'
                    )
                )
                .append(" ");
        }
        return binary.toString().trim();
    }

    private String fromBinary(String input) {
        String[] bytes = input.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (String b : bytes) {
            if (b.length() != 8 || !Pattern.matches("[01]+", b)) {
                throw new IllegalArgumentException("Invalid binary string.");
            }
            result.append((char) Integer.parseInt(b, 2));
        }
        return result.toString();
    }

    private String rsaEncrypt(String input) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA"); // educational; prefer OAEP in real life
        cipher.init(Cipher.ENCRYPT_MODE, rsaKeyPair.getPublic());
        byte[] encrypted = cipher.doFinal(
            input.getBytes(StandardCharsets.UTF_8)
        );
        return Base64.getEncoder().encodeToString(encrypted);
    }

    private String rsaDecrypt(String input) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, rsaKeyPair.getPrivate());
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(input));
        return new String(decrypted, StandardCharsets.UTF_8);
    }

    private String sha256Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuilder hex = new StringBuilder();
        for (byte b : hash) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

    private String md5Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        StringBuilder hex = new StringBuilder();
        for (byte b : hash) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

    private String vigenereCipher(String input, String key, boolean encrypt) {
        StringBuilder result = new StringBuilder();
        key = key.toUpperCase();
        int keyIndex = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int shift = key.charAt(keyIndex % key.length()) - 'A';
                shift = encrypt ? shift : -shift;
                result.append((char) (base + ((c - base + shift + 26) % 26)));
                keyIndex++;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private String aesEncrypt(String input, String key) throws Exception {
        if (key.length() != 16) throw new IllegalArgumentException(
            "AES key must be 16 characters."
        );
        SecretKeySpec secretKey = new SecretKeySpec(
            key.getBytes(StandardCharsets.UTF_8),
            "AES"
        );
        Cipher cipher = Cipher.getInstance("AES"); // educational; likely AES/ECB/PKCS5Padding
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(
            input.getBytes(StandardCharsets.UTF_8)
        );
        return Base64.getEncoder().encodeToString(encrypted);
    }

    private String aesDecrypt(String input, String key) throws Exception {
        if (key.length() != 16) throw new IllegalArgumentException(
            "AES key must be 16 characters."
        );
        SecretKeySpec secretKey = new SecretKeySpec(
            key.getBytes(StandardCharsets.UTF_8),
            "AES"
        );
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(input));
        return new String(decrypted, StandardCharsets.UTF_8);
    }

    /** Append a line to crypto.log with a timestamp. */
    private void logToFile(String logEntry) {
        try (
            BufferedWriter writer = new BufferedWriter(
                new FileWriter("crypto.log", true)
            )
        ) {
            writer.write("[" + LocalDateTime.now() + "] " + logEntry);
            writer.newLine();
        } catch (IOException ex) {
            resultArea.append(
                "Error writing to log file: " + ex.getMessage() + "\n\n"
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CryptoTool().setVisible(true));
    }
}
