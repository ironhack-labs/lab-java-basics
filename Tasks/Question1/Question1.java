package Question1;

public class Question1 {
     static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         for (int value : values) {
             System.out.println(value);

         }
        int difference = values[9] - values[0];
        System.out.println("The difference between the highest and lowest value is: " + difference);

        int highestValue = values[9];
        for (int value : values) {
            if (value > highestValue) {
                highestValue = value;
            }
        }


        int lowestValue = values[0];
        for(int value : values) {
            if (value < lowestValue) {
                lowestValue = value;
            }
        }
        int firstSmallest = values[0];
        for (int value : values) {
            if (value < firstSmallest) {
                firstSmallest = value;
            }
        }
        int secondSmallest = values[1];
        for (int value : values) {
            if (value < secondSmallest && value > firstSmallest) {
                secondSmallest = value;
            }


        }
        System.out.println(highestValue + " is the highest value");
        System.out.println(lowestValue + " is the lowest value");
        System.out.println(firstSmallest + " is the first smallest value");
        System.out.println(secondSmallest + " is the second smallest value");


    }
}