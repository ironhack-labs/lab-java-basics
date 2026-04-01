package Week2LabTest;

/**
 * Represents an Intern, which is a specialized type of Employee.
 * Enforces a maximum salary constraint.
 */
public class Intern extends Employee {

    // Constant salary cap for all interns
    public static final double MAX_SALARY = 20000;

    public Intern(int id, String name, double salary, String department) {
        super(id, name, 0, department); // initialize with safe salary
        setSalary(salary); // apply validation
    }

    /**
     * Overrides salary setter to enforce maximum salary rule.
     */
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds intern limit. Setting to max: " + MAX_SALARY);
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
}