/**
 * A03_Employee — Represents an employee of a company.
 * Contains personal and professional properties with getters and setters.
 */
public class A03_Employee {

    private String firstName;
    private String lastName;
    private String department;
    private double salary;

    /**
     * Constructor with all properties.
     */
    public A03_Employee(String firstName, String lastName, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    // --- Getters and Setters ---

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    /**
     * Returns a readable string with all employee properties.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}