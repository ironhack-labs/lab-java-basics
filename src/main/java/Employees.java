public class Employees {

    public static void main(String[] args) {
        // Array of 10 Employees
        Employee[] employees = new Employee[10];

        // Array Fill
        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee(
                    "Employee" + i,
                    i,
                    30000 + i * 1000,
                    "Department" + i
            );
        }

        // Print all employees
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayEmployee();
        }
    }
}
