public class SmallestNr {
    public static void main(String[] args) {


        int[] numbers = {4, 7, -20, 15};

        int absMin = numbers[0]; // absolute minimum value
        int secondMin = Integer.MAX_VALUE; // second min value

        for (int num : numbers) {
            if (num < absMin) { // if num (which is 4 to start with) is smaller than absolute min value (which is 4 also)
                secondMin = absMin; // this mean we have found a number smaller than absMin, update secondMin to reflect current second smallest nr
                absMin = num; // update absMin to reflect current smallest nr

                // Otherwise, check if the current number is smaller than our current second smallest
                // AND is not equal to the smallest (to avoid duplicates)

            } else if (num < secondMin && num != absMin) {
                secondMin = num;
            }
        }
        System.out.println("Smallest = " + absMin);
        System.out.println("Second smallest = " + secondMin);

    }
}
