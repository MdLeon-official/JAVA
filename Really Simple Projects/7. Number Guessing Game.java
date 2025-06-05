import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;

        int min;
        System.out.println("Enter the minimum number: ");
        min = scanner.nextInt();

        int max = 100;
        System.out.println("Enter the maximum number: ");
        max = scanner.nextInt();

        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number guessing game");
        System.out.printf("Guess a number between %d-%d\n", min, max);


        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.printf("Answer is Greater than %d\n", guess);
            }
            else if (guess > randomNumber) {
                System.out.printf("Answer is Less than %d\n", guess);
            }
            else {
                System.out.printf("CORRECT! The number was %d.\n", guess);
                System.out.printf("You have guessed the number in %d attempt.\n", attempts);
            }
            
        }while(guess != randomNumber);


        scanner.close();
    }
}
