import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        array = a collection of values of the same data type
                think of it as a variable that can store more than 1 value 
        */

        String[] fruits = {"apple", "mango", "banana", "coconut"};
        fruits[0] = "pineapple";

        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        // for(int i = 0; i < numOfFruits; i++){
        //     System.out.println(fruits[i]);
        // }

        Arrays.sort(fruits); //sort an array

        //ENHANCED FOR LOOP
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        Arrays.fill(fruits, "MEAT");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
