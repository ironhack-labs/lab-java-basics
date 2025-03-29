public class DifferenceBetweenArrays {
    public static int getDifference(int[] arr) {

        int max = arr[0];
        int min = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 9, 5, 10};

        int difference = getDifference(numbers);
        System.out.println("The Difference between the largest and the smallest value is " + difference);
    }
}