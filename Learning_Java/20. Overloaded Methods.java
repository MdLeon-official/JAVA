public class Main {
    public static void main(String[] args) {
        /*
         overloaded methods = methods that share the same name, 
                              but different parameters
                              signature = name + parameters
        */

        System.out.println(add(1,2));

        System.out.println(bakePizza("flat bread"));
    }

    static double add(double a, double b) {
        return a+b;
    }
    static double add(double a, double b, double c) {
        return a+b+c;
    }
    static double add(double a, double b, double c, double d) {
        return a+b+c+d;
    }


    static String bakePizza(String bread) {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
}
