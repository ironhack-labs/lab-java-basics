import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // --- Test arrays ---
        int[] numbers = {5, 2, 9, 1, 7};

        int diff = Utils.differenceMaxMin(numbers);
        System.out.println("Diferencia entre mayor y menor: " + diff);

        Utils.findTwoSmallest(numbers);

        System.out.println("\n--- Empleados ---");

        // Crear 10 empleados
        Employee[] employees = new Employee[10];
        Random random = new Random();

        for (int i = 0; i < employees.length; i++) {
            if (i % 3 == 0) {
                // Algunos serán interns
                employees[i] = new Intern("Intern_" + i, i, 15000 + random.nextInt(10000));
            } else {
                employees[i] = new Employee("Employee_" + i, i, 25000 + random.nextInt(20000));
            }
        }

        // Imprimir todos los empleados
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
    }
}