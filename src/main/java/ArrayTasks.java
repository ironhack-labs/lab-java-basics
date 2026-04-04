public class ArrayTasks {

    // Difference between largest and smallest
    public static int getDifference(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    //  Smallest and second smallest
    public static void findSmallestAndSecond(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        // Task 1
        int result = getDifference(numbers);
        System.out.println("Difference: " + result);

        // Task 2
        findSmallestAndSecond(numbers);
    }
}