import java.util.*;

public class program92 {

    public static void main(String[] args) {
        int[] nums = { 5, 7, 2, 4, 9 };

        int ctr_even = 0, ctr_odd = 0;

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ctr_even++;
            } else {
                ctr_odd++;
            }
        }

        // Print the counts of even and odd elements in the array
        System.out.printf(
            "\nNumber of even elements in the array: %d",
            ctr_even
        );
        System.out.printf("\nNumber of odd elements in the array: %d", ctr_odd);
        System.out.printf("\n");
    }
}
