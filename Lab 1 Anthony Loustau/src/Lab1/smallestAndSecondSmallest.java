package Lab1;

public class smallestAndSecondSmallest {
    public static void smallestAndSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = arr[1];

        if (secondSmallest < smallest) {
            int temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 2, 8, 7};
        smallestAndSecondSmallest(numbers);
    }
}

