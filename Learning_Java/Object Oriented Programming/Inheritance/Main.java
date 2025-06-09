public class Main {
    public static void main(String[] args) {
        /*
        Inheritance = One class inherits the attributes and method from another class
                      Chile <- Parent <- GrandParent
        */

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        // dog.eat();
        // cat.eat();

        dog.speak();
        cat.speak();
    }
}
