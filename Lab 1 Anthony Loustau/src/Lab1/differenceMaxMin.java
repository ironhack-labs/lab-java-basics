package Lab1;

public class differenceMaxMin {
    public static int differenceMaxMin(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 2, 8, 7};
        int diff = differenceMaxMin(numbers);
        System.out.println("Difference between max and min: " + diff);
    }
}



