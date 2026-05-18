/**
 * A04_Intern — Represents an intern. Extends A03_Employee.
 * Interns have a maximum salary cap of 20000.
 * If a higher salary is set, it is automatically capped and a warning is printed.
 */
public class A04_Intern extends A03_Employee {

    // Maximum salary allowed for any intern (constant)
    public static final double MAX_SALARY = 20000;

    /**
     * Constructor — validates salary on creation.
     */
    public A04_Intern(String firstName, String lastName, String department, double salary) {
        super(firstName, lastName, department, 0); // initialize with 0, then validate
        setSalary(salary);
    }

    /**
     * Overrides setSalary to enforce the salary cap.
     * If salary exceeds MAX_SALARY, it is set to MAX_SALARY and a warning is printed.
     */
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Warning: Intern salary cannot exceed " + MAX_SALARY + ". Setting to max.");
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    /**
     * Returns a readable string including the salary cap for debugging purposes.
     */
    @Override
    public String toString() {
        return "Intern{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                ", maxSalary=" + MAX_SALARY +
                '}';
    }
}