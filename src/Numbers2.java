public class Numbers2 {
    void main() {

        //Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.
        // Use loops and conditionals to develop the algorithm.
        int[] numbers = {1, 81, 3, 4, 20};

        // Inizializziamo con i valori massimi possibili per trovare i minimi
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            // Logica per Differenza (Max/Min)
            if (number > max) max = number;
            if (number < min) min = number;

            // Logica per il più piccolo e il secondo più piccolo
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        System.out.println("Differenza (Max - Min): " + (max - min));
        System.out.println("Il più piccolo: " + smallest);
        System.out.println("Il secondo più piccolo: " + secondSmallest);
    }

}