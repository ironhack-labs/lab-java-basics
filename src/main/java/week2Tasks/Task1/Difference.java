package week2Tasks.Task1;

public class Difference {
    int min;
    int max;

    public int getDifference(int[] numbers) {
        min = numbers[0];
        max = numbers[0];

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
        Difference difference = new Difference();

        int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println( "The difference is " + difference.getDifference(numbers));
    }
}


