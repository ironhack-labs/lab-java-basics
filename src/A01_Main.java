/**
 * A01_Main — Entry point of the Java Basics Lab.
 * Orchestrates the execution of all tasks.
 */
public class A01_Main {

    public static void main(String[] args) {

        // Task 1: Calculate the difference between the largest and smallest value in an array
        int[] numbers = {3, 1, 7, 2, 9, 4};
        System.out.println("=== Task 1 ===");
        System.out.println("Difference: " + A02_ArrayUtils.getDifference(numbers));

        // Task 2: Find and print the smallest and second smallest elements
        System.out.println("=== Task 2 ===");
        A02_ArrayUtils.findTwoSmallest(numbers);

        // Task 5: Create 10 employees (including interns) and print all their properties
        System.out.println("=== Task 5 ===");
        A05_EmployeeList.printEmployees();
    }
}