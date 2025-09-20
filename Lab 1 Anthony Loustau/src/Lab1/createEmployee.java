package Lab1;

public class createEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Alice", 30, 50000);
        employees[1] = new Employee("Bob", 25, 45000);
        employees[2] = new Intern("Charlie", 22, 21000);
        employees[3] = new Employee("David", 35, 60000);
        employees[4] = new Intern("Eve", 21, 18000);
        employees[5] = new Employee("Frank", 28, 52000);
        employees[6] = new Employee("Grace", 32, 48000);
        employees[7] = new Intern("Hannah", 23, 20000);
        employees[8] = new Employee("Ian", 40, 70000);
        employees[9] = new Employee("Jane", 27, 46000);

        for (Employee emp : employees) {
            emp.printInfo();
        }
    }
}
