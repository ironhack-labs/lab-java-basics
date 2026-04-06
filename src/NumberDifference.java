import java.util.ArrayList;

public class NumberDifference {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 8, 26, 24, 28, 49, 59, 92, 94};
        int difference = getdifferencelargestsmallest(numbers);
        System.out.println("The difference between the largest and smallest values is " + difference);
    }

      public static int getdifferencelargestsmallest(int[] numbers){
            int largestNumber = numbers[0];
            int smallestNumber = numbers[0];

        // to find the largest number
        for (int number : numbers) {
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        // to find the smallest number
        for (int number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

       return largestNumber - smallestNumber;
      }


}