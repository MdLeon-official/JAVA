import java.util.Scanner;

public class program23 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            String binary = input.nextLine();
            int decimal = Integer.parseInt(binary, 2);
            String hex = Integer.toHexString(decimal).toUpperCase();
            System.out.println("Octal: " + hex);
        }
    }
}
