package Task3;

public class Employee {

    String name;
    double salary;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }
}