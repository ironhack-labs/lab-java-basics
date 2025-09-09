package arrayProgram;

public class Array {
    int[] Numbers;
    // int arraySize;

    // constructor
    public Array(int[] numbers) {
        Numbers = numbers;
        // this.arraySize = arraySize; add above too
    }

    // getters and setters
    public int[] getNumbers() {
        return Numbers;
    }

    public void setNumbers(int[] numbers) {
        Numbers = numbers;
    }

    // public void createArray() // this would be used to create an array in input

    // this method calculates the max and min number of the array and calculates the difference between them
    public void getMaxMinDiff() {
        if (Numbers.length >= 1) {
            int maxN = Numbers[0];
            int minN = Numbers[0];
            for (int number : Numbers) {
                if (number > maxN) {
                    maxN = number;
                } else if (number < minN) {
                    minN = number;
                }
            }
            System.out.println("The maximum number is: " + maxN);
            System.out.println("The minimum number is: " + minN);
            System.out.println("The difference is: " + (maxN - minN));
        } else {
            System.out.println("Array of numbers is not long enough!");
        }

    }

    // this method finds the smallest and second smallest number of the array and prints it
    public void getSmall() {
        if (Numbers.length >= 1) {
            int minN;
            int minN2;
            if (Numbers[0] < Numbers[1]) {
               minN = Numbers[0];
               minN2 = Numbers[1];
            } else {
               minN = Numbers[1];
              minN2 = Numbers[0];
            }
            for (int i = 2; i < Numbers.length; i++) {
                int num = Numbers[i];
                if (num < minN) {
                    minN2 = minN;
                    minN = num;
                } else if (num < minN2 && num != minN) {
                    minN2 = num;
                }
            }
            System.out.println("The smallest number is: " + minN);
            System.out.println("The second smallest number is: " + minN2);
        } else {
            System.out.println("Array of numbers is not long enough!");
        }
    }


    }

