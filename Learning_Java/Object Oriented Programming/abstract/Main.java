public class Main {
    public static void main(String[] args) {
        /*
        abstract = Used to define abstract classes and methods
                   Abstraction is the process of hiding implementation details
                   and showing only the essential features;
                   Abstract classes CAN'T be instantiated directly
                   Can contain 'abstract' methods (which must be implemented)
                   Can contain 'concrete' methods (which are inherited) 
        */

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(6,7);

        circle.display();
        System.out.println(circle.area());

        rectangle.display();
        System.out.println(rectangle.area());

        triangle.display();
        System.out.println(triangle.area());

    }
}
