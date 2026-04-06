public class Main {
    public static void main(String[] args) {
        // --- PRUEBA TAREA 1 & 2 ---
        int[] myNumbers = {15, 2, 8, 25, 1, 30};

        System.out.println("Diferencia Max-Min: " + calculateDifference(myNumbers));
        findSmallestElements(myNumbers);

        System.out.println("\n--- TAREA 5: LISTA DE 10 EMPLEADOS ---");

        // Creamos un array para almacenar 10 objetos Employee o Intern
        Employee[] staff = new Employee[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                staff[i] = new Employee("Staff_" + i, 35000 + (i * 1000));
            } else {
                // Intentamos ponerle 25000, pero el código lo bajará a 20000 automáticamente
                staff[i] = new Intern("Intern_" + i, 25000);
            }
            // Imprimimos todas las propiedades usando el toString()
            System.out.println(staff[i]);
        }
    }

    // TAREA 1: Algoritmo de diferencia
    public static int calculateDifference(int[] nums) {
        if (nums.length < 1) return 0;
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }

    // TAREA 2: Los dos más pequeños
    public static void findSmallestElements(int[] nums) {
        if (nums.length < 2) return;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (n < secondSmallest && n != smallest) {
                secondSmallest = n;
            }
        }
        System.out.println("El menor es: " + smallest);
        System.out.println("El segundo menor es: " + secondSmallest);
    }
}