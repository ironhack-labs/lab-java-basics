package org.example;

public class ArrayMath {

//    1) Write a method in Java to get the difference between the largest and smallest values in an array of integers.
//       The length of the array must be 1 and above. Use loops and conditionals to develop the algorithm.
//    2) Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.
//       Use loops and conditionals to develop the algorithm.

    // Returns the difference between min and max of an array of Int
    public static int getDiffOfMaxMinFrom(int[] args) {
        int max = args[0];
        int min = args[0];

        if (args.length > 1) {
            for (int arg : args) {
                if (arg > max) {
                    max = arg;
                } else if (arg < min) {
                    min = arg;
                }
            }
            return (min > 0) ? max - min : max + min;
        }
        else {
            System.out.println("The length of the array must be 1 and above.");
            return 0;
        }
    }

    // Prints in console the min 2 elements of an array
    public static void getTwoSmallestNumbersFrom(int[] args) {
        int min = args[0];
        int min2 = args[0];
        if (args.length > 2) {
            for (int arg : args) {
                if (arg < min) {
                    min2 = min;
                    min = arg;
                }
            }
            System.out.println("The two smallest numbers are " + min + " and " + min2);
            }
        else {
            System.out.println("The length of the array must be 2 and above.");
        }
    }
}
