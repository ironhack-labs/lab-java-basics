public class SmallestElement {
    public static void findSmallestAndSecondSmallest(int[] arr) {

        if (arr.length < 2) {
            System.out.println("You must have two elements");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;

            }

            if (secondSmallest == Integer.MAX_VALUE) {
            } else {
                System.out.println("Smallest: " + smallest);
                System.out.println("Second Smallest: " + secondSmallest);

            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5, 10};

        findSmallestAndSecondSmallest(numbers);


    }
}


