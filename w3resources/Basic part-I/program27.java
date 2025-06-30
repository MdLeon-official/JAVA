import java.util.Scanner;

public class program27 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter an Octal number: ");
            String octal = input.nextLine();
            
            int decimal = Integer.parseInt(octal, 8);

            String hex = Integer.toHexString(decimal);

            System.out.println("Hexadecimal: " + hex);
        }
    }
}
