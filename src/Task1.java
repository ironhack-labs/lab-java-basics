public class Task1 {
    public static int difference(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 15, 30, 5, 9 };
        System.out.println("Difference = " + difference(arr));
    }
}

