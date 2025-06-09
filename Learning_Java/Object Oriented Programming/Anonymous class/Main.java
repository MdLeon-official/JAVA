public class Main {
    public static void main(String[] args) {
        // Anonymous class = A class that does not have a name and is used to instantiate a class or interface
        // It is used to create a one-time use class that is not reused anywhere else in the code
        // It is used to create a class that is not reused anywhere else in the code

        Dog dog = new Dog();
        Dog anonymousDog = new Dog() {
            @Override
            void bark() {
                System.out.println("Meow! Meow!");
            }
        };
        dog.bark();
        anonymousDog.bark();
    }
}
