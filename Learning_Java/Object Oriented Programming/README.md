

### 🧱 **Class and Object**

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

```java
Animal a = new Dog();  // Dog is treated as Animal type
a.sound();  // Calls Dog's sound() method
```

---

### 🧰 **Abstract Class**

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

```java
class Student {
    String name;
}

Student[] students = new Student[3];
students[0] = new Student();
```

---

### 📋 **ArrayList**

* A resizable array from `java.util` package.

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
```

---

### 🏷️ **Enums**

* Special class to define a group of constants.

```java
enum Day { MONDAY, TUESDAY, WEDNESDAY }
Day d = Day.MONDAY;
```

---

### 🧰 **Generics**

* Used to create classes and methods that work with any data type.

```java
class Box<T> {
    T value;
}
Box<Integer> intBox = new Box<>();
```

---

### 🧷 **Static Keyword**

* Belongs to the class, not objects. Shared among all objects.

```java
class Example {
    static int count = 0;
}
```

---

### 🧭 **Super Keyword**

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


