public class Main {
    public static void main(String[] args) {
        /*
        ternary operator ? = Return 1 or 2 values if a condition is true
        variable = (conditin) ? ifTrue : ifFalse
        */

        int score = 70;
        String passOrFail = (score >= 50) ? "PASS" : "FAIL";
        System.out.println(passOrFail);


        int number = 3;
        String everOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(everOrOdd);


        int hours = 14;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
