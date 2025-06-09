public class Main {
    public static void main(String[] args) {
        // Exception Handling = The process of responding to the occurrence of exceptions
        //                     = An exception is an event that disrupts the normal flow of a program
        //                     = Exceptions can be handled using try-catch blocks
        // try{} , catch{} , finally{}

        try{
            System.out.println(1 / 0);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
        catch(Exception e){
            // This will catch any exception that is not caught by the previous catch blocks
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
            System.out.println("This will always run.");
        }
    }
}
