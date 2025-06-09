

### 🧱 **Class and Object**

## 🧠 Object Oriented Programming (OOP)

* **What:** A way of programming using **objects** (like real-world things).
* **Why:** Easier to manage, reuse, and understand code.
* **Use when:** You want to model real-life stuff (like user, car, bank).

* **Class**: A class is a blueprint for creating objects. It defines variables (fields) and methods (functions) that the objects will have.
* **Object**: An object is an instance of a class. Each object has its own copy of the class’s fields.

**Example:**

```java
class Car {
    String color;
    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Object created from class
        myCar.color = "Red";
        myCar.drive();  // Output: Car is driving
    }
}
```

---

### 🧪 **Constructor**

* **What:** A special method that runs when you create an object.
* **Why:** To give initial values to your object.
* **Use when:** You want to set up something as soon as object is created.

* A constructor is a special method that is called automatically when an object is created.
* Its name is the same as the class name.
* It can be used to assign default or initial values.

**Example:**

```java
class Student {
    String name;

    Student(String n) {  // Constructor
        name = n;
    }
}
```

---

### 🧢 **Overloaded Constructors**

* **What:** Multiple constructors with different input values.
* **Why:** Flexibility in how you create objects.
* **Use when:** You want to allow creating an object in multiple ways.

* This means having more than one constructor in a class, each with different parameters.
* Useful when you want to give multiple ways to create an object.

**Example:**

```java
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
```

---

### 🔐 **Getters and Setters**

* **What:** Methods to read (`get`) or update (`set`) private variables.
* **Why:** Keeps data safe (encapsulation).
* **Use when:** You have `private` variables and still want access to them.

* These are used to access (get) and update (set) private variables.
* Ensures **encapsulation**: hiding internal data.

**Example:**

```java
class Employee {
    private int salary;

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}
```

**Use Case:** Protect internal data and control how it is accessed/changed.

---

### 🧬 **Inheritance**

* **What:** One class **inherits** (gets) properties from another class.
* **Why:** Reuse code, avoid repetition.
* **Use when:** You have a "is-a" relationship. (e.g., Dog is-an Animal)

* A class (child) can **inherit** fields and methods from another class (parent).
* Reuse existing code.

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
```

---

### 🔁 **Method Overriding**

* **What:** A child class **changes** a method from the parent class.
* **Why:** To give a specific version of a method.
* **Use when:** Inherited method doesn’t fit child class perfectly.

* A child class changes the behavior of a method inherited from the parent.

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

---

### 🧩 **Polymorphism**

* **What:** One thing acts in **many forms**.
* **Why:** Same method name, different behavior depending on object.
* **Use when:** You want to write general code that works for many classes.

* Means "many forms". A method behaves differently based on the object.

#### 1. **Compile-time Polymorphism** (Method Overloading):

```java
class Math {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

#### 2. **Runtime Polymorphism** (Method Overriding):

* **What:** Actual method that runs is chosen at runtime.
* **Why:** Flexibility — program decides at run-time.
* **Use when:** Using parent class reference to call child class method.

```java
Animal a = new Dog();  // Dog is treated as Animal type
a.sound();  // Calls Dog's sound() method
```

---

### 🧰 **Abstract Class**

* **What:** A class/method with **no body** (just a plan).
* **Why:** Force subclasses to implement it.
* **Use when:** You want to define rules but not full logic.

* Can't create objects directly.
* Can have normal and abstract methods.
* Used for common base classes.

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
```

---

### 🔌 **Interface**

* **What:** A contract. It tells what methods a class must have.
* **Why:** Force different classes to follow a rule.
* **Use when:** You want different classes to behave similarly (e.g., `Printable`).

* Like a contract: defines method signatures only.
* A class that "implements" an interface must define all methods.

```java
interface Animal {
    void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

---

### 🧲 **Composition**

* **What:** Stronger version of Aggregation.
* **Why:** If the main object is destroyed, parts are also destroyed.
* **Use when:** Part **cannot exist** without whole. (e.g., Human has Heart)

* A class **has an object** of another class (a "has-a" relationship).

```java
class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    Engine e = new Engine();
}
```

---

### 🧩 **Aggregation**

* **What:** One class **has-a** another class.
* **Why:** Represent a relationship, but **not strongly connected**.
* **Use when:** Objects can exist **independently** (e.g., Department has Teachers, but teachers can exist without department).

* A weaker form of composition. One object can exist independently of the other.

```java
class Address {
    String city;
}

class Person {
    Address address;  // Aggregation
}
```

---

### 💬 **Anonymous Class**

* **What:** A class with **no name**, created for **one-time use**.
* **Why:** Quick use of custom behavior without creating a full class.
* **Use when:** You need short-term, quick custom behavior.
* 
* A class without a name, used for one-time use, often with interfaces.

```java
interface Hello {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Hello h = new Hello() {
            public void sayHello() {
                System.out.println("Hello!");
            }
        };
        h.sayHello();
    }
}
```

---

### 📦 **Array of Objects**

* **What:** An array that holds multiple objects.
* **Why:** Store many object instances together.
* **Use when:** You want to manage multiple objects like books, students.

```java
class Student {
    String name;
}

Student[] students = new Student[3];
students[0] = new Student();
```

---

### 📋 **ArrayList**

* **What:** A flexible list of objects (like an array, but better).
* **Why:** Size can grow/shrink easily.
* **Use when:** You need to store many objects, and change size often.

* A resizable array from `java.util` package.

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
```

---

### 🏷️ **Enums**

* **What:** A special type to define fixed set of constants.
* **Why:** Prevent invalid values.
* **Use when:** You have fixed choices (e.g., DAYS = MON, TUE, ...)

* Special class to define a group of constants.

```java
enum Day { MONDAY, TUESDAY, WEDNESDAY }
Day d = Day.MONDAY;
```

---

### 🧰 **Generics**

* **What:** Writing code that works with any data type.
* **Why:** Type safety and reuse.
* **Use when:** You want same logic to work for different data types (like in ArrayList<T>).

* Used to create classes and methods that work with any data type.

```java
class Box<T> {
    T value;
}
Box<Integer> intBox = new Box<>();
```

---

### 🧷 **Static Keyword**

* **What:** Belongs to **class**, not to objects.
* **Why:** Shared among all objects.
* **Use when:** You want one common value/method for all objec

* Belongs to the class, not objects. Shared among all objects.

```java
class Example {
    static int count = 0;
}
```

---

### 🧭 **Super Keyword**

* **What:** Refers to **parent class**.
* **Why:** To access things from parent.
* **Use when:** Child class wants to call parent’s method or constructor.


* Used to call the parent class's method or constructor.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // Calls Animal's sound
        System.out.println("Dog barks");
    }
}
```

