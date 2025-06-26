import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = scanner.nextInt();
        System.out.print("Input second integer: ");
        int second = scanner.nextInt();

        if (first == second) System.out.printf("%d == %d\n", first, second);
        if (first != second) System.out.printf("%d != %d\n", first, second);
        if (first < second) System.out.printf("%d < %d\n", first, second);
        if (first > second) System.out.printf("%d > %d\n", first, second);
        if (first <= second) System.out.printf("%d <= %d\n", first, second);
        if (first >= second) System.out.printf("%d >= %d\n", first, second);

        scanner.close();
    }
}
