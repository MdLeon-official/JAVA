import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer = Class that schedules tasks at specific times or periodically
        //Useful for: sending reminders, updating UI, or running background tasks
        // TimerTask = Abstract class that represents a task to be executed by a Timer
        // Useful for: defining the task to be executed at a scheduled time
        // Example: Sending a reminder every 5 seconds

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3; // Number of times the task should run
        
            @Override
            public void run() {
                System.out.println("Reminder: Take a break!");
                count--;
                if (count <= 0) {
                    System.out.println("No more reminders.");
                    timer.cancel(); // Stop the timer after 3 reminders
                    
                }
            }
        };
        timer.schedule(task, 0, 10000); // Schedule the task to run every 1 seconds
    }
}
