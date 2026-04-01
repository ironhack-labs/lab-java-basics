public class Main {

    public static void main(String[] args) {
        // --- TASK 1: Difference between max and min ---
        System.out.println("--- Task 1: Difference Between Max and Min ---");
        int[] numbers1 = {5, 10, 2, 8, 15, 1};
        int diff = getDifference(numbers1);
        System.out.println("Difference between largest and smallest: " + diff);

        // --- TASK 2: Smallest and second smallest ---
        System.out.println("\n--- Task 2: Smallest and Second Smallest ---");
        int[] numbers2 = {12, 3, 5, 1, 9, 2};
        findAndPrintSmallest(numbers2);

        // --- TASK 5: Create 10 Employees and print ---
        System.out.println("\n--- Task 5: List of 10 Employees ---");
        createAndPrintEmployees();
    }

    // TASK 1: Method to get the difference
    public static int getDifference(int[] arr) {
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Array must have at least 1 element");
        }

        int max = arr[0];
        int min = arr[0];

        // Using loops and conditionals
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

    // TASK 2: Method to find and print the two smallest elements
    public static void findAndPrintSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array needs at least 2 elements for this task.");
            return;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("Smallest: " + first + ", Second smallest: Does not exist (equal values)");
        } else {
            System.out.println("Smallest: " + first + ", Second smallest: " + second);
        }
    }

    // TASK 5: Create 10 employees and print
    public static void createAndPrintEmployees() {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Juan Perez", 101, 30000);
        employees[1] = new Intern("Ana Gomez", 102, 15000);
        employees[2] = new Employee("Carlos Ruiz", 103, 45000);
        employees[3] = new Intern("Luis Torres", 104, 18000);
        employees[4] = new Employee("Maria Diaz", 105, 32000);
        employees[5] = new Intern("Pedro Sanchez", 106, 20000);
        employees[6] = new Employee("Sofia Lima", 107, 50000);
        employees[7] = new Intern("Jorge Castro", 108, 12000);
        employees[8] = new Employee("Elena Nito", 109, 28000);
        employees[9] = new Employee("Raul Bo", 110, 35000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employees[i].toString());
        }
    }
}