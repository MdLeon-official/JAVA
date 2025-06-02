import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        // if statement = performs a block of code if its condition is true
            
        Scanner scanner = new Scanner (System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a studen(true/false): ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()) {
            System.out.println("You didn't enter your name.");
        }else {
            System.out.println("Hello " + name);
        }

        if (age >= 18) {
            System.out.println("You are an adult!");
        }
        else if (age >= 0) {
            System.out.println("You are a senior!");
        }
        else if (age < 0) {
            System.out.println("You haven't been born yet");
        }
        else if (age == 0) {
            System.out.println("You are a baby!");
        }
        else {
            System.out.println("You are a child!");
        }


        if (isStudent) {
            System.out.println("You are a student.");
        }
        else {
            System.out.println("You are NOT a student.");
        }
    }
}
