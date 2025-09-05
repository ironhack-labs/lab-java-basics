package Question1;

import java.util.ArrayList;
import java.util.Arrays;

public class Difference {
    public static void main(String[] args) {

        int[] numbers = {5 , 11, 23};
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
            System.out.println("Max number is "+ max);
            System.out.println("Min number is " + min);

            int subtraction = max - min;
        System.out.println("Difference is " + subtraction);

    }
}