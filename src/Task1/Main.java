package Task1;

public class Main {

    public static int difference(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        System.out.println("Difference: " + difference(arr));
    }
}