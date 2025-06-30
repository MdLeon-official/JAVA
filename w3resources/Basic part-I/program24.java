import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a Binary number: ");
            String binary = input.nextLine();
            int decimal = Integer.parseInt(binary, 2);
            String octal = Integer.toOctalString(decimal);
            System.out.print("Octal: " + octal);
        }
    }
}
