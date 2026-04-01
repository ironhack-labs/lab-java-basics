package Week2LabTest;

/**
 * Utility class for array-related operations.
 * Demonstrates use of loops, conditionals, and defensive programming.
 */
public class List {

    /**
     * Returns the difference between the largest and smallest values in the array.
     *
     * @param numbers input array (must contain at least 1 element)
     * @return difference (max - min)
     */
    public static int getDifference(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int min = numbers[0];
        int max = numbers[0];

        // Iterate through array to find min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max - min;
    }

    /**
     * Finds and prints the smallest and second smallest values in the array.
     *
     * @param numbers input array (must contain at least 2 elements)
     */
    public static void printTwoSmallest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            // Update smallest and second smallest accordingly
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}