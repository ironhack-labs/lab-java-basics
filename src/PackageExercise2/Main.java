package PackageExercise2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2");
        int[] listOfNumbers = {5, 12, 8, 15, 3};

        int arraySize = listOfNumbers.length;
        int minNum = listOfNumbers[0];
        int minNum2 = listOfNumbers[0];

        for (int i = 1; i < arraySize; i++) {
            if (listOfNumbers[i] < minNum && arraySize >=1) {
                minNum = listOfNumbers[i];

            }
        }
    System.out.println("The Min integer of the array is "+minNum);

        for (int i = 1; i < arraySize; i++) {
            if (listOfNumbers[i] < minNum && arraySize >=1 && minNum2 != minNum ) {
                minNum2 = listOfNumbers[i];

            }
        }

    System.out.println("The second Min integer of the array is "+minNum2);

    }

}

