public class A02_ArrayUtils {

    // Task 1: difference between largest and smallest value in an array
    public static int getDifference(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        return max - min;
    }

    // Task 2: find smallest and second smallest elements
    public static void findTwoSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}
