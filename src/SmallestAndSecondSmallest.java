import java.util.Random;
import java.util.Arrays;

public class SmallestAndSecondSmallest {
        public static void main(String[] args) {

            Random rand = new Random();
            int numberOfElements = 15;

            // Creating the array
            int [] numbersArray = new int[numberOfElements];
            for (int i = 0; i<numberOfElements; i++) {
                numbersArray[i] = rand.nextInt(100);
            }
            System.out.println("The initial array:");
            System.out.println(Arrays.toString(numbersArray));

            for (int i = 0; i < numbersArray.length - 1; i++) {
                for (int j = 0; j < numbersArray.length - 1; j++) {
                    if (numbersArray[j] > numbersArray[j+1]) {
                        int temporary = numbersArray[j];
                        numbersArray[j] = numbersArray[j+1];
                        numbersArray[j+1] = temporary;
                    }
                }
            }
            System.out.println("\nSorted array:");
            System.out.println(Arrays.toString(numbersArray));

            System.out.println("\nThe two smallest numbers are: " + numbersArray[0] + ", " + numbersArray[1]);
        }
}
