import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        while loop = repeat some code forever
                     while some condition remains true
        */
        Scanner scanner = new Scanner(System.in);

        // String name = "";

        // while (name.isEmpty()) {
        //     System.out.println("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello " + name);


        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        do {
            System.out.println("Your age can't be negative!");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while (age < 0);

        System.out.println("You are " + age + " years old");


        scanner.close();
    }
}
