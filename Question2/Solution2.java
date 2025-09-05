package Question2;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr = {15,2,6,7,9,10};

        if (arr.length < 2) {
            System.out.println("Array must have at least three elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all elements may be equal).");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}
