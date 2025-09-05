package Question2;

public class Smallestelement {
    public static void main(String[] args) {
        int[] numbers = {66, 27, 38, 11, 50};
        {
            int smallnum = Integer. MAX_VALUE;
            int secondsmallnum = Integer.MAX_VALUE;

            for (int num : numbers) {
                if (num < smallnum) {
                    secondsmallnum=smallnum;
                    smallnum = num;
                }
                if (secondsmallnum > num && num> smallnum) {
                    secondsmallnum = num;
                }
            }
            System.out.println("Smallest number is " + smallnum);
            System.out.println("Second smallest number is " + secondsmallnum);

        }
    }
}