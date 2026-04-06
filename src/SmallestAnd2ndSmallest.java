public class SmallestAnd2ndSmallest {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 8, 26, 24, 28, 49, 59, 92, 94};
        int smallestNumber = getsmallestNumber(numbers);
        int secondSmallestNumber = getsecondSmallestNumber(numbers, smallestNumber);
        System.out.println("The smallest element is " + smallestNumber);
        System.out.println("The second smallest element is " + secondSmallestNumber);
    }

    public static int getsmallestNumber(int[] numbers) {
        int smallestNumber = numbers[0];


        // to find the smallest number
        for (int number : numbers) {
            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }

        return smallestNumber;
    }

    public static int getsecondSmallestNumber(int[] numbers, int smallestNumber) {
          int secondSmallestNumber = Integer.MAX_VALUE;


        for (int number : numbers) {
            if ( number != smallestNumber &&  number < secondSmallestNumber){
                secondSmallestNumber = number;
            }
        }
        return secondSmallestNumber;
    }

}