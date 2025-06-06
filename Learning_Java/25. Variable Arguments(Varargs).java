public class Main {
    public static void main(String[] args) {
        /*
        varargs(variable arguments)
            allow a method to accept a varying number of arguments
            makes methods more flexible, no need for overloaded methods
            java will pack the arguments into an array
            ...(ellipsis)
        */
        
        System.out.println(add(1,2,3,4));
        System.out.println(average(1,2,3,4,324,32,12,43));
    }
    static int add(int... numbers){
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;

        if(numbers.length == 0) {
            return 0;
        }

        for(double i : numbers) {
            sum += i;
        }

        return sum/numbers.length;
    }
}
