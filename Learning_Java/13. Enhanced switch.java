import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Enhanced switch = A replacement to many else if statements

        Scanner scanner = new Scanner(System.in);
        String day;
        day = scanner.nextLine();

        switch (day) {
            // case "Monday" -> System.out.println("It is a weekday :(");
            // case "Tuesday" -> System.out.println("It is a weekday :(");
            // case "Wednesday" -> System.out.println("It is a weekday :(");
            // case "Thursday" -> System.out.println("It is a weekday :(");
            // case "Friday" -> System.out.println("It is the weekend :)");
            // case "Saturday" -> System.out.println("It is the weekend :)");
            // case "Sunday" -> System.out.println("It is a weekday :(");

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Sunday" ->  System.out.println("It is a weekday :(");
            case "Friday", "Saturday" -> System.out.println("It is the weekend :)");
            default -> System.out.println(day + " is not a day");
        }

        scanner.close();
    }
}
