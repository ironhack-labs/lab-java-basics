public class SmallestTwo {

    public static void findTwoSmallest(int[] arr) {
        // Need at least 2 elements to find a second smallest
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return;
        }

        int smallest       = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Single pass: update smallest and second smallest as we go
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest; // old smallest is pushed down
                smallest       = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest found (all elements are equal).");
        } else {
            System.out.println("Smallest:        " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 1, 4};          // Normal case
        int[] arr2 = {-4, -1, -9, -2, -6};     // All negatives
        int[] arr3 = {7, 7, 7, 7};             // All same → no second smallest
        int[] arr4 = {7, 7, 3, 7};             // Duplicates with one different
        int[] arr5 = {100, 5};                 // Exactly two elements
        int[] arr6 = {42};                     // Too short

        System.out.println("--- arr1 ---");
        findTwoSmallest(arr1);

        System.out.println("--- arr2 ---");
        findTwoSmallest(arr2);

        System.out.println("--- arr3 ---");
        findTwoSmallest(arr3);

        System.out.println("--- arr4 ---");
        findTwoSmallest(arr4);

        System.out.println("--- arr5 ---");
        findTwoSmallest(arr5);

        System.out.println("--- arr6 ---");
        findTwoSmallest(arr6);
    }
}