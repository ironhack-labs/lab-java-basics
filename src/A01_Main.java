public class A01_Main {

    public static void main(String[] args) {

        // Task 1: difference between largest and smallest value
        int[] numbers = {3, 1, 7, 2, 9, 4};
        System.out.println("=== Task 1 ===");
        System.out.println("Difference: " + A02_ArrayUtils.getDifference(numbers));

        // Task 2: smallest and second smallest
        System.out.println("=== Task 2 ===");
        A02_ArrayUtils.findTwoSmallest(numbers);

        // Task 5: create 10 employees and print all properties
        System.out.println("=== Task 5 ===");
        A05_EmployeeList.printEmployees();
    }
}