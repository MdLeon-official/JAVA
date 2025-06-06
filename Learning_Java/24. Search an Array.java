public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,3,54,9,24,2,4};
        int target = 24;
        boolean isFound = false;

        //Liniear search
        for(int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array.");
        }
    }
}
