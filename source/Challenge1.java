import java.util.Arrays;
import java.util.Scanner;

public class Challenge1 {
    // 1) Difference between largest and smallest values in an int array (length >= 1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers in different lines:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the getdifference method
        int diff = getdifference(arr);
        System.out.println("Difference between max and min: " + diff);
        sc.close();
    }
    public static int getdifference(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("invalid array");
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            // Loop + conditionals
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
                if (arr[i] > max) max = arr[i];
            }
            return max - min;

        }
    }

