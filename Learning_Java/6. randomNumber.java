import java.util.Random;


public class Main {
    public static void main(String[] arg) {
        Random random = new Random();

        int number;
        number = random.nextInt(1,7);//Between 1 and 6
        System.out.println(number);

        double n;
        n = random.nextDouble(1.0,7.0);//Between 1 and 6
        System.out.println(n);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
    }
}
