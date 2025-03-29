public class ExerciseTwoApplication {
    public static void findValue(int[] array) {
        // Check if the array has at least two elements
        if (array == null || array.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        // Initialize the smallest and second smallest with maximum possible values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Iterate through the array to find the smallest and second smallest elements
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        // Check if a valid second smallest element was found
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No distinct second smallest element found.");
        } else {
            System.out.println("The smallest element is " + smallest +
                    " and the second smallest element is " + secondSmallest + ".");
        }
    }

    public static void main(String[] args) {
        int[] array = {52, 77, -8, 12, 14, 31};
        findValue(array);
    }
}

