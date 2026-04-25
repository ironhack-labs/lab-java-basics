public class Numbers {
    //Write a method in Java to get the difference between the largest and smallest values in an array of integers.
    // The length of the array must be 1 and above. Use loops and conditionals to develop the algorithm.
    void main() {
        int[] numbers = {2, 8, 23, 14, 5};

        // Inizializziamo con il primo elemento dell'array
        int maxNumberList = numbers[0];
        int minNumberList = numbers[0];

        for (int number : numbers) {
            // Controllo per il massimo
            if (number > maxNumberList) {
                maxNumberList = number;
            }
            // Controllo per il minimo
            if (number < minNumberList) {
                minNumberList = number;
            }
        }

        int difference = maxNumberList - minNumberList;

        System.out.println("Max num is: " + maxNumberList);
        System.out.println("Min num is: " + minNumberList);
        System.out.println("The difference is: " + difference);
    }


}
