import java.util.Scanner;

public class program29 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a Hexadecimal number: ");

            String hex = input.nextLine();
            int decimal = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(decimal);

            System.out.println("Binary: " + binary);
        }
    }
}
