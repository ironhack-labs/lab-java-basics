public class twoSmallest {

    public static void findTwoSmallest(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            
            if (current < smallest) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current < secondSmallest && current != smallest) {
                secondSmallest = current;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Array does not have a second smallest element");
        } else {
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: "+ secondSmallest);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {-3, -2, -2, -1, 0, 1, 2, 3, 3, 4};
        int[] numbers_2 = {1, 2, 3, 4, 5};
        findTwoSmallest(numbers);
        findTwoSmallest(numbers_2);
    }
}
