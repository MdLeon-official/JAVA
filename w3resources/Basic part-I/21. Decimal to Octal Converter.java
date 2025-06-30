import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimal = scanner.nextInt();

        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number is: " + octal);

        scanner.close();
    }
}
