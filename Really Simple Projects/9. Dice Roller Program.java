import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //declare variables
        int numOfDice;
        int total = 0;

        //get number of dice from the user
        System.out.println("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        //check if number of dice > 0
        if (numOfDice > 0) {
            //roll the dice
            for(int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1,7);
                printDice(roll);
                System.out.println("You rolled: " + roll);
                total = total + roll;
            }

            //get the total
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("Number of dice must be greater than 0.");
        }

        

        
        scanner.close();
    }
    
    //display ascii of dice
    static void printDice(int roll) {
        String dice1 = """
                -------
               |       |
               |   •   |
               |       |
                -------
                """;
        String dice2 = """
                -------
               | •     |
               |       |
               |     • |
                -------
                """;
        String dice3 = """
                -------
               | •     |
               |   •   |
               |     • |
                -------
                """;
        String dice4 = """
                -------
               | •   • |
               |       |
               | •   • |
                -------
                """;
        String dice5 = """
                -------
               | •   • |
               |   •   |
               | •   • |
                -------
                """;
        String dice6 = """
                -------
               | •   • |
               | •   • |
               | •   • |
                -------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }

    }
}
