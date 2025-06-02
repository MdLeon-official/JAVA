import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 4);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.14);
        result = Math.max(10, 20);

        System.out.println(result);


        //Exercise => HYPOTENUSE c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) * Math.pow(b,2));
        System.out.println("The hypotenuse (side c) is: " + c);
    }
}
