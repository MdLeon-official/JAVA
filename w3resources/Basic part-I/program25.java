import java.util.Scanner;
public class program25 {  
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter an Octal Number: ");
            String octal = input.nextLine();

            int decimal = Integer.parseInt(octal, 8);
            System.out.println("Decimal: " + decimal);
        }
    }
    
}
