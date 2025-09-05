public class NrDiff {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 15};

        // we create a more robust way check first values of array, in this case both are set to 1
        // now it does not matter what the start value of array is, previous logic assumed the next value in array always increased

        int min = numbers[0];
        int max = numbers[0];

        // enhanced for-loop, we use num which checks each value of the array and assigns what it finds to min or max (depending on < or >)

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // print out the difference between max and min values

        System.out.println("Difference = " + (max - min));
    }

}