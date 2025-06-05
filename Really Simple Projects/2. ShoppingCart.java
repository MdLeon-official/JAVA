import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        System.out.println("You have bought " + quantity + " " + item +  "/s");
        double total = price * quantity;
        System.out.println("Your total is $" + total);
    }
}
