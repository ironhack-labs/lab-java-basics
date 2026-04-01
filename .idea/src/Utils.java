class Utils {

    // 1. Diferencia entre el mayor y el menor valor
    public static int differenceMaxMin(int[] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException("El array debe tener al menos un elemento");
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }

    // 2. Encontrar el menor y segundo menor
    public static void findTwoSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("El array debe tener al menos dos elementos");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        System.out.println("Menor: " + smallest);
        System.out.println("Segundo menor: " + secondSmallest);
    }
}
