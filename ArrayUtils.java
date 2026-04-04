public class ArrayUtils {

    public static int getDifference(int[] array) {
        validateArray(array);

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }

    public static void printTwoSmallest(int[] array) {
        validateArray(array);

        if (array.length < 2) {
            System.out.println("Smallest: " + array[0]);
            System.out.println("Second smallest: not available");
            return;
        }

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
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest: not available");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }

    private static void validateArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one value.");
        }
    }
}
