import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // for loop = execute some code a certain amount of time
        // for(int i = 0; i < 10; i++) {
        //     System.out.println("One Piece");
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();
        // for (int i = 1; i <= max; i++) {
        //     System.out.println(i);
        // }



        // int start = 10;
        for (int i = max; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("EID Mubarak");

        scanner.close();
    }
}
