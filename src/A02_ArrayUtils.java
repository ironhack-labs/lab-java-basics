/**
 * A02_ArrayUtils — Utility class for array operations.
 * Contains methods for Tasks 1 and 2.
 */
public class A02_ArrayUtils {

    /**
     * Task 1: Returns the difference between the largest and smallest value in an array.
     * Uses a single loop to find max and min simultaneously.
     * @param array integer array with length >= 1
     * @return difference between max and min values
     */
    public static int getDifference(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i]; // update max if current value is greater
            if (array[i] < min) min = array[i]; // update min if current value is smaller
        }

        return max - min;
    }

    /**
     * Task 2: Finds and prints the smallest and second smallest elements in an array.
     * Uses two variables initialized to MAX_VALUE and a single loop.
     * @param array integer array with length >= 2
     */
    public static void findTwoSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                // New smallest found: shift current smallest to second position
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                // New second smallest found (must differ from smallest)
                secondSmallest = array[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}