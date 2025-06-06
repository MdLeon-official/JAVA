public class Main {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called

        String name = "Leon";
        int age = 19;

        happyBirthday(name, age);
        happyBirthday("Luffy", 21);

        double result = square(3);
        System.out.println(result);

        System.out.println(getFullName("Leon", "Islam"));

        if (ageCheck(age)) {
            System.out.println("You may sign up.");
        }else {
            System.out.println("You need to 18+ to sign up.");
        }
    }

    static void happyBirthday(String name, int age) {
        System.out.printf("Happy Birthday, %s\n", name);
        System.out.printf("You are %d years old.\n", age);
    }

    static double square(int n) {
        return n * n;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
