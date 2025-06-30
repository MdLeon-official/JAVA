import java.util.Scanner;

public class program86 {

    public static void main(String[] args) {
        System.out.println("Input the value of n: ");

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while (n != 1) {
            // Check if n is even
            if (n % 2 == 0) {
                n = n / 2; // If even, divide n by 2
            } else {
                n = (3 * n + 1) / 2; // If odd, perform a calculation
            }
        }

        System.out.println("\nValue of n = " + n);

        in.close();
    }
}
