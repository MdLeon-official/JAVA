import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice.");
            }
            else {
                computerChoice = choices[random.nextInt(3)];
                System.out.println("Computer choice: " + computerChoice);
    
                if (playerChoice.equals(computerChoice)) {
                    System.out.println("It's a tie");
                }
    
                else if (playerChoice.equals("paper") && computerChoice.equals("rock") ||
                playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                    System.out.println("You Win!");
                }
                else {
                    System.out.println("You Lose!");
                }
            }


            System.out.println("Play again? (yes/no)");
            playAgain = scanner.nextLine();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing.");

        scanner.close();
    }
}
