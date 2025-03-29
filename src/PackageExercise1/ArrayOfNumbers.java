package PackageExercise1;

public class ArrayOfNumbers {

    public static void main(String[] args) {
    System.out.println("Exercise 1");
        int[] listOfNumbers = {5, 12, 8, 15, 3};

        int arraySize = listOfNumbers.length;
        int maxNum = listOfNumbers[0];
        int minNum = listOfNumbers[0];
        for (int i = 1; i < arraySize; i++) {
            if (listOfNumbers[i] > maxNum && arraySize >=1) {
                maxNum = listOfNumbers[i];

            }
        }
        for (int i = 1; i < arraySize; i++) {
            if (listOfNumbers[i] < minNum && arraySize >=1) {
                minNum = listOfNumbers[i];

            }

        }
        System.out.println("The Max integer of the array is "+maxNum);
        System.out.println("The Min integer of the array is "+minNum);
        System.out.println("The difference between the Max and the Min of the array is "+(maxNum-minNum));
    }

}

