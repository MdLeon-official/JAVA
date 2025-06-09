public class Main {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special Java type used to define collections of constants.
        // Enums are used to define a fixed set of constants, which can be used to represent a group of related values.
        // Enums are defined using the enum keyword.

        Day day = Day.MONDAY;
        System.out.println("Day: " + day);
        System.out.println("Day Number: " + day.getDayNumber());

        switch(day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SUNDAY -> {
                System.out.println("It's a weekday.");
            }
            case SATURDAY, FRIDAY -> {
                System.out.println("It's a weekend.");
            }
        }
    }
}
