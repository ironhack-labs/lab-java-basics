/**
 * A05_EmployeeList — Creates a list of 10 employees (including interns)
 * and prints all their properties.
 * Demonstrates polymorphism: both Employee and Intern objects stored in the same array.
 */
public class A05_EmployeeList {

    public static void printEmployees() {
        // Array of 10 employees — mix of regular employees and interns
        A03_Employee[] employees = {
                new A03_Employee("Alice", "Smith", "Engineering", 55000),
                new A03_Employee("Bob", "Jones", "Marketing", 48000),
                new A03_Employee("Carlos", "Garcia", "Engineering", 62000),
                new A03_Employee("Diana", "Lee", "HR", 45000),
                new A03_Employee("Eva", "Muller", "Finance", 70000),
                new A04_Intern("Frank", "Brown", "Engineering", 18000),
                new A04_Intern("Grace", "Wilson", "Marketing", 25000), // exceeds cap → set to 20000
                new A03_Employee("Hana", "Kim", "Finance", 67000),
                new A03_Employee("Ivan", "Petrov", "Engineering", 58000),
                new A04_Intern("Julia", "Rossi", "HR", 15000)
        };

        // Print all properties using each class's toString() method
        for (A03_Employee e : employees) {
            System.out.println(e);
        }
    }
}