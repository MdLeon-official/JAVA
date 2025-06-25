import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Input first number: ");
        num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        num2 = scanner.nextInt();

        System.out.println("Expected Output :");
        System.out.printf("%d x %d = %d\n", num1, num2, (num1 * num2));
        scanner.close();
    }
}
