package week2Tasks.Task1;

public class Elements {
    int smallestNumber = 0;
    int secondSmallestNumber = 0;

    public static void main(String[] args) {
        int[] myNumbers = {10, 5, 8, 2, 11};

        int smallest = Integer.MAX_VALUE;;
        int secondSmallest = Integer.MAX_VALUE;;

        for(int number : myNumbers){
            if(number < smallest){
                secondSmallest = smallest;
                smallest = number;
            }
            else if (number < secondSmallest) {
                secondSmallest = number;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}
