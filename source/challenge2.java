public class challenge2 {
    public static void findSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Need at least 2 elements");
            return;
        }

        // Start by assuming first two numbers are smallest and second smallest
        int smallest = arr[0];
        int secondSmallest = arr[1];

        // Make sure smallest < secondSmallest
        if (smallest > secondSmallest) {
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        // Check rest of the array
        for (int i = 2; i < arr.length; i++) {
            int current = arr[i];

            if (current < smallest) {
                // Found new smallest, shift previous smallest to secondSmallest
                secondSmallest = smallest;
                smallest = current;
            } else if (current < secondSmallest && current != smallest) {
                // Found new second smallest (different from smallest)
                secondSmallest = current;
            }
        }

        // Print results
        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        int[] data = {7, 2, 9, 2, 15, 8, 3};
        findSmallest(data);
    }
}



