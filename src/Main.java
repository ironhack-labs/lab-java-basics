public class Main {
    public static void main(String[] args) {

        // --- Tarea 1 y 2: Pruebas de los algoritmos de Array ---
        int[] numbers = {45, 12, 89, 2, 34, 1, 99, 12};

        System.out.println("--- Arrays ---");
        System.out.println("Diferencia entre Max y Min: " + getDifference(numbers));
        printSmallestAndSecondSmallest(numbers);
        System.out.println();

        // --- Tarea 5: Crear 10 empleados (mezclando Employees e Interns) ---
        System.out.println("--- Lista de Empleados ---");
        Employee[] company = new Employee[10];

        company[0] = new Employee("Ana", "IT", 55000);
        company[1] = new Employee("Luis", "HR", 42000);
        company[2] = new Intern("Carlos", "Marketing", 15000); // Salario válido
        company[3] = new Intern("Elena", "IT", 25000); // Salario inválido, se limitará a 20000
        company[4] = new Employee("Marta", "Sales", 60000);
        company[5] = new Employee("Jorge", "Finance", 70000);
        company[6] = new Intern("Pedro", "HR", 18000);
        company[7] = new Employee("Sofia", "Legal", 80000);
        company[8] = new Employee("Raul", "Sales", 52000);
        company[9] = new Intern("Laura", "Design", 22000); // Salario inválido

        // Imprimir las propiedades de todos
        for (int i = 0; i < company.length; i++) {
            System.out.println(company[i].toString());
        }
    }

    // Tarea 1: Diferencia entre el mayor y menor
    public static int getDifference(int[] arr) {
        if (arr == null || arr.length < 1) return 0;

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    // Tarea 2: Encontrar el más pequeño y el segundo más pequeño
    public static void printSmallestAndSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("El array debe tener al menos 2 elementos.");
            return;
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != firstSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo elemento más pequeño (todos son iguales).");
        } else {
            System.out.println("Smallest: " + firstSmallest + " | Second Smallest: " + secondSmallest);
        }
    }
}