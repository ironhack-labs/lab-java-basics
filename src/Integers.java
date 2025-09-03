
public class Integers {
    public static void main(String[] args) {

        //Write a method in Java to get the difference
        // between the largest and smallest values in an
        // array of integers. The length of the array must
        // be 1 and above. Use loops and conditionals to
        // develop the algorithm.

        int[] numberLists = {10, 20, 30, 40, 50, 60};
        int highestNumber = numberLists[0];
        for(int number : numberLists){
            if(number > highestNumber){
                highestNumber = number;
            }
        }
        System.out.println("The Highest Number " + highestNumber);

        int lowestNumber = numberLists[0];
        for(int number : numberLists){
            if(number == lowestNumber){
                System.out.println("The Lowest Number " + lowestNumber);
            }
        }


        int subtraction = highestNumber - lowestNumber;
        System.out.println("The difference between Highest and Lowest Number is " + subtraction);

    }
}

