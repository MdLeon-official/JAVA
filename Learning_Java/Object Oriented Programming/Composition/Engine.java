public class Engine {
    String type;
    
    Engine(String type) {
        this.type = type;
    }

    // @Override
    // public String toString() {
    //     return "Engine{" +
    //             "type='" + type + '\'' +
    //             '}';
    // }

    void start() {
        System.out.println("Engine of type " + this.type + " started.");
    }
}
