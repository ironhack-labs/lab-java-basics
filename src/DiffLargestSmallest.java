import java.util.Random;
import java.util.Arrays;

public class DiffLargestSmallest {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberOfElements = 15;

        // Creating the array
        int [] numbersArray = new int[numberOfElements];
        for (int i = 0; i<numberOfElements; i++) {
            numbersArray[i] = rand.nextInt(100);
        }
        System.out.println("The full array:");
        System.out.println(Arrays.toString(numbersArray));

        // Highest Value
        int maxValue = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] > maxValue) {
                maxValue = numbersArray[i];
            }
        }
        System.out.println("The highest value is " + maxValue);

        // Lowest value
        int minValue = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] < minValue) {
                minValue = numbersArray[i];
            }
        }
        System.out.println("The lowest value is " + minValue);

        // The difference
        int difference = maxValue - minValue;
        System.out.println("The difference between the lowest and the highest is " + difference);
    }
}
