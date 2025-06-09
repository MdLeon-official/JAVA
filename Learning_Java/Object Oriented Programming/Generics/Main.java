import java.util.ArrayList;

import javax.swing.Box;

public class Main {
    public static void main(String[] args) {
        // Generics = A concept where you can write a class, interface, or method
        // that is compatible with different date types
        // <T, U> type parameter (Placeholder that gets replaces with a real type)
        // <String> type argument (specifies the type)

        // Box<String> box = new Box<>();
        // box.setItem("Hello Generics");
        // String item = box.getItem();
        // System.out.println(item);


        Product<String, Double> product = new Product<>("Laptop", 999.99);
        System.out.println("Product: " + product.item + ", Price: $" + product.price);
        System.out.println("Item: " + product.getItem() + ", Price: $" + product.getPrice());
    }
}
