package Question1;

public class Solution1 {
    public static int getDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i =1; i < arr.length; i++) {
         if ( arr[i]> max) {
             max = arr[i];
         }
         if (arr[i] < min) {
             min = arr[i];
         }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] numbers = {8,2,15,6};
        System.out.println("Difference: " + getDifference(numbers));
    }
}
