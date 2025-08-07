// An interface is like a set of rules you must follow if you want to join a game.
interface Pet {
    void play();
}

// Abstract(Abstraction means showing only the important stuff, hiding the messy details) Class - base class for all animals
abstract class Animal {

    private String name; // Encapsulation

    //Constructor - A constructor is a special method that creates the object.
    public Animal(String name) {
        this.name = name;
    }

    //Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Abstract method (Abstraction)
    abstract void makeSound();

    //Method overloading (same method name, different params)
    public void sleep() {
        System.out.println(name + " is sleeping....");
    }

    public void sleep(int hours) {
        System.out.println(name + " is sleeping for " + hours + " hours....");
    }
}

// Dog inherits Animal and implements Pet (inheritance)
class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name); //super is a keyword in Java that means “call the parent’s version”.
    }

    // Overriding abstract method (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: WOOF!");
    }

    // Overriding interface method
    @Override
    public void play() {
        System.out.println(getName() + " is playing fetch.");
    }
}

// Cat inherits Animal and implements Pet (Inheritance)
class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    // Overriding abstract method (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: MEOW!");
    }

    // Overriding interface method
    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball.");
    }
}

public class Main {

    public static void main(String[] args) {
        // Object creation
        Dog dog = new Dog("Bob");
        Cat cat = new Cat("Chopper");

        // Using methods
        dog.makeSound();
        dog.play();
        dog.sleep();
        dog.sleep(5);

        System.out.println();

        cat.makeSound();
        cat.play();
        cat.sleep();
        cat.sleep(8);
    }
}
