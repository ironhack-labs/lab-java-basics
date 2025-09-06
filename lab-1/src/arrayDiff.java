public class arrayDiff {

    public static int getDiff (int[] nums) {
        int minimum = nums[0];
        int maximum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minimum) {
                minimum = nums[i];
            } else if (nums[i] > maximum) {
                maximum = nums[i];
            }
        }

        return maximum - minimum;
    }

    public static void main(String[] args) {
        int[] numbers = {-3, -2, -2, -1, 0, 1, 2, 3, 3, 4};
        int difference = getDiff(numbers);
        System.out.println("The difference between the largest and smallest integer in the array is: " +difference);
    }
}
