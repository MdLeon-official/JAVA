import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input a decimal number: ");
            int decimalNumber = input.nextInt();
            String binaryNumber = Integer.toBinaryString(decimalNumber);
            System.out.println("Binary number is: " + binaryNumber);
        }
    }
}
