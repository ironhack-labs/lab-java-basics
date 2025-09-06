public class Task2 {
    public static void findTwoSmallest(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        int[] arr = {13, 4, 7, 2, 20, 5};
        findTwoSmallest(arr);
    }
}
