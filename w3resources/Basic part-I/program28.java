import java.util.Scanner;

public class program28 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a Hexadecimal number: ");

            String hex = input.nextLine();
            int decimal = Integer.parseInt(hex, 16);
            System.out.print("Decimal: " + decimal);
            
        }
    }
}
