import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber, secondNumber;
        char operators;
        double result = 0;
        boolean validOpertion = true;

        System.out.print(" Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operators = scanner.next().charAt(0);

        System.out.print(" Enter the second number: ");
        secondNumber = scanner.nextDouble();


        switch (operators) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if(secondNumber == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOpertion = false;
                }else {
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber);
        
            default -> {
                System.out.println("Enter a valid operator");
                validOpertion = false;
            }
        }

        if (validOpertion) {
            System.out.printf("%.0f %c %.0f = %.1f\n", firstNumber, operators, secondNumber, result);
        }


        scanner.close();
    }
}
