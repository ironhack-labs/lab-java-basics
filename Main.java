package Week2LabTest;

/**
 * Main class to test all functionality.
 * Demonstrates:
 * - Array algorithms
 * - Object creation
 * - Inheritance
 * - Looping through objects
 */
public class Main {

    public static void main(String[] args) {

        // ---------------- ARRAY TESTS ----------------
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Difference between max and min: " + List.getDifference(numbers));

        List.printTwoSmallest(numbers);

        // ---------------- EMPLOYEE CREATION ----------------
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(1, "Alice", 30000, "HR");
        employees[1] = new Employee(2, "Bob", 35000, "IT");
        employees[2] = new Employee(3, "Charlie", 40000, "Finance");
        employees[3] = new Employee(4, "David", 45000, "Marketing");
        employees[4] = new Employee(5, "Eve", 50000, "IT");
        employees[5] = new Employee(6, "Frank", 55000, "HR");
        employees[6] = new Employee(7, "Grace", 60000, "Finance");
        employees[7] = new Employee(8, "Hank", 65000, "Marketing");
        employees[8] = new Employee(9, "Ivy", 70000, "IT");

        // Intern with salary exceeding limit (tests validation)
        employees[9] = new Intern(10, "Jack", 25000, "Intern");

        // ---------------- PRINT ALL EMPLOYEES ----------------
        System.out.println("\n--- Employee Details ---");

        for (Employee employee : employees) {
            employee.printDetails();
        }
    }
}