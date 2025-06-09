import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that strores a list of elements
        //           = Can be found in the java.util package
        //           = Can hold objects of any type (even primitives)
        //           = Can be used to store a list of elements that can grow or shrink in size

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(1);
        // list.add(2);

        // list.remove(1); // Removes the element at index 1 (which is 1 in this case)
        // list.set(0, 5); // Sets the element at index 0 to 5

        // System.out.println("List: " + list);
        // System.out.println(list.get(0)); // Gets the element at index 0
        // System.out.println(list.size()); // Gets the size of the list
        // Collections.sort(list);
        // System.out.println("Sorted List: " + list);


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.println("Enter food items: ");
        int numfoods = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numfoods; i++) {
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println("Food items: " + foods);

        scanner.close();
    }
}
