package Task4;

public class Intern extends Employee {

    private static final double MAX_SALARY = 20000; // Maximum allowed salary

    public Intern(String name, double salary) {
        super(name, 0);      // Initialize salary to 0 first
        setSalary(salary);   // Set salary with validation
    }

    @Override
    public void setSalary(double salary) {
        if (salary <= MAX_SALARY) {
            super.setSalary(salary);  // Apply salary if within limit
        } else {
            System.out.println("Salary exceeds max limit of " + MAX_SALARY);
        }
    }
}