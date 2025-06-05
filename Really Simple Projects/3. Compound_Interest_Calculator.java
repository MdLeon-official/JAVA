import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        double A; //amount
        double P; //principal
        double r; //rate
        int n; //times compounded
        int t; //years

        // Compound interest, A = P[1+r/n]^nt

        System.out.print("Enter the principal amount: ");
        P = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %): ");
        r = scanner.nextDouble() / 100;
        System.out.print("Enter the # of times compounded per year: ");
        n = scanner.nextInt();
        System.out.print("Enter the # of year: ");
        t = scanner.nextInt();

        A = P * Math.pow((1  + r/n), n*t);
        System.out.printf("The amount after %d years is %.2f\n", t, A);


        scanner.close();
    }
}
