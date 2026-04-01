package Week2LabTest;

/**
 * Represents a generic employee in a company.
 * Demonstrates encapsulation and clean OOP design.
 */
public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;

    /**
     * Parameterized constructor to initialize employee object.
     */
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // ---------------- GETTERS ----------------

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    // ---------------- SETTERS ----------------

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets salary. Can be overridden in subclasses for validation.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Prints all employee details.
     */
    public void printDetails() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Salary: " + salary +
                ", Department: " + department);
    }
}