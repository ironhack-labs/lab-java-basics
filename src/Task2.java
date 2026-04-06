public class ArrayMethods {

    public static void findSmallestTwo(int[] arr) {
        // Inicializamos con el valor máximo posible para que cualquier número del array sea menor
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                // El que era el más pequeño pasa a ser el segundo
                secondSmallest = smallest;
                // El actual se convierte en el más pequeño
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                // Si es mayor que el pequeño pero menor que el segundo, actualizamos el segundo
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}