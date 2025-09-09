package arrayProgram;

public class Main {
    public static void main(String[] args) {
        Array NumbersArray1 = new Array(new int[]{-10, 2, 1, -5, 79}); // first new is for Object, second new is for Array

        NumbersArray1.getMaxMinDiff();
        System.out.println("=========================");
        NumbersArray1.getSmall();
        System.out.println("=========================");


    }
}
