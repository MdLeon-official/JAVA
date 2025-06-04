import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        /*
        .substring() = A method used to extract a portion of a string
        .substring(start, end)
        */

        Scanner scanner = new Scanner(System.in);

        String email;
        email = scanner.nextLine();

        if (email.contains("@")) {
            String username;
            String domain;
            // String username = email.substring(0, 5);
            // String username = email.substring(0, email.indexOf("@"));
            // String domain = email.substring(6);
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }
        else {
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}
