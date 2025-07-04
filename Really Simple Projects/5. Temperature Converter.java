import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase(); //if you just want a single character

        newTemp = (unit.equals("C")) ? ((temp - 32) * 5/9) : ((temp * 5/9) + 32);

        System.out.printf("%.1f degree %s\n", newTemp, unit);

        scanner.close();
    }
}
