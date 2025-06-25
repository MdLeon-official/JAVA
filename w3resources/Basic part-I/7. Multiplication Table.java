import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Input a number: ");
        n = scanner.nextInt();

        System.out.println("Expected output: ");
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",n,i,(n*i));
        }
        scanner.close();
    }
}
