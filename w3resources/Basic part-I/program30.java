import java.util.Scanner;

public class program30 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a Hexadecimal number: ");
            String hex = input.nextLine();
            int decimal = Integer.parseInt(hex, 16);
            String octal = Integer.toOctalString(decimal);
            System.out.println("Octal: " + octal);
        }
    }
}
