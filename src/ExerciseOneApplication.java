public class ExerciseOneApplication {
    public static int findDiff(int[] numbers) {
        // Validate that the array has at least one element
        if (numbers == null || numbers.length == 0) {
            System.out.println("list of values");  ;
        }

        // Initialize min and max with the first element of the array
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find the minimum and maximum values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Return the difference between the maximum and minimum values
        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {18, 56, 27, 99, 53};
        int difference = findDiff(array);
        System.out.println("Difference between values: " + difference);
    }
}

