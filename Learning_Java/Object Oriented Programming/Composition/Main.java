public class Main {
    public static void main(String[] args) {
        // composition = Represents a "part-of" relationship
        // For example, an Engine is part of a Car.
        // Allows complex objects to be built from simpler ones,

        Car car = new Car("Toyota Camry", 2020, "V6");
        System.out.println(car.model + " (" + car.year + ") with " + car.engine.type);
        car.start();
    }
}
