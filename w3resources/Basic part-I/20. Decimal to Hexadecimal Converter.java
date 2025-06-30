import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        int decimal = scanner.nextInt();

        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal number is : " + hexadecimal);

        scanner.close();
    }
}
