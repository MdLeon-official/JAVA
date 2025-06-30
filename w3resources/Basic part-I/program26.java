import java.util.Scanner;

public class program26 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter an Octal Number: ");
            String octal = input.nextLine();    
            int decimal = Integer.parseInt(octal,8);
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary: "+ binary);
        }
    }
}
