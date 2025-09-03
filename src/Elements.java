public class Elements {
    public static void main(String[] args) {
        //Write a method in Java to find the
        // smallest and second, smallest elements
        // of a given array and print it in the
        // console. Use loops and conditionals to
        // develop the algorithm.

        String[] elements = new String[4];
        elements[0] = "3kg of Rice";
        elements[1] = "20kg of Maize";
        elements[2] = "25kg of Grains";
        elements[3] = "5kg of Flour";

        System.out.println("Elements of the Array:");
        for (String element : elements) {System.out.println(element);}

        for (int i = 0; i < 1; i++) {
                System.out.println(elements[i] + " is the smallest element:");
        }

        for (int i = 3; i < 4; i++) {
                System.out.println(elements[i] + " is the second smallest element: ");
        }

    }
}