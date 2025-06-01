public class Main {
    public static void main(String[] arg) {
        // 2 steps to creating a variable - declaration, assignment
        
        // => int
        int year = 2025;
        System.out.println("The year is " + year);

        // => double
        double price = 11.5;
        System.out.println("Price is $"+ price);

        // => char
        char grade = 'A';
        char symbol = '!';
        System.out.println("Grade: " + grade);

        // => boolean
        boolean isStudent = true;
        if(isStudent) {
            System.out.println("You are a Student");
        }
        else {
            System.out.println("You are not a student.");
        }

        // => string
        String name = "One Piece";
        System.out.println(name);
    }
}
