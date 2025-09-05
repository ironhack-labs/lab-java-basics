public class Main {
    public static void main(String[] args) {
        // Create an array of Employees
        Employee[] employees = new Employee[10];

        // Employees
        employees[0] = new Employee("Alice", 30, "Manager", 50000);
        employees[1] = new Employee("Bob", 25, "Developer", 40000);
        employees[2] = new Employee("Charlie", 28, "Designer", 35000);
        employees[3] = new Employee("Diana", 32, "HR", 30000);
        employees[4] = new Employee("Ethan", 29, "Developer", 42000);

        // Interns
        employees[5] = new Intern("Frank", 22, "Intern Developer", 18000);
        employees[6] = new Intern("Grace", 21, "Intern Designer", 21000); // exceeds max
        employees[7] = new Intern("Hannah", 23, "Intern HR", 15000);
        employees[8] = new Intern("Ian", 20, "Intern Tester", 20000);
        employees[9] = new Intern("Jack", 24, "Intern Developer", 25000); // exceeds max

        // Print all employees
        for (Employee emp : employees) {
            emp.printInfo();
        }
    }
}
