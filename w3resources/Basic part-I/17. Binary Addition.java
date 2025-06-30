import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter first binary number: ");
            String binary1 = input.nextLine();
            System.out.print("Enter second binary number: ");
            String binary2 = input.nextLine();
            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);
            int sum = num1 + num2;
            String binarySum = Integer.toBinaryString(sum);
            System.out.println("Sum: " + binarySum);
        }
    }
}
