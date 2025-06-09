import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // LocalTime time = LocalTime.now(); // Get the current time
        // LocalDateTime time = LocalDateTime.now(); // Get the current date and time

        // Instant instant = Instant.now(); // Get the current instant in time UTC

        // System.out.println("Current time: " + instant);

        //cUSTOM FORMAT
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println("Formatted date and time: " + newDateTime);

        LocalDate date1 = LocalDate.of(2024, 1, 2); // Create a date with year, month, and day
        LocalDate date2 = LocalDate.of(2024, 2, 2); // Create a date with year, month, and day
        if (date1.isBefore(date2)) {
            System.out.println("date1 is before date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("date1 is after date2");
        } else {
            System.out.println("date1 is equal to date2");
            
        }
    }
}
