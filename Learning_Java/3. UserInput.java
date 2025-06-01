import java.util.Scanner; //Imports the Scanner class so we can take user input from the keyboard.
 
public class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take input from keyboard

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a full line (can include spaces)
        // String name = scanner.next(); // This would stop reading after the first space

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.print("What is your gpa: ");
        double gpa =  scanner.nextDouble(); // Reads a decimal number

        System.out.print("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean(); // Reads a boolean value

        System.out.println("Hello " + name); // Display user's name
        System.out.println("You are " + age + " years old."); // Display age
        System.out.println("Your gpa is: " + gpa); // Display GPA
        System.out.println("Student: " + isStudent); // Display student status

        //! COMMON ISSUE
        System.out.println("Enter your age: ");
        int yourAge = scanner.nextInt(); // Reads another integer
        scanner.nextLine(); // Fixes scanner bug: clears leftover newline character

        System.out.println("Enter your favourite color: ");
        String color = scanner.nextLine(); // Now it works properly due to the line above

        System.out.println("You are " + yourAge + " years old."); // Display age again
        System.out.println("Your favourite color is " + color); // Display favorite color

        scanner.close(); // Close the scanner (best practice)
    }
}
