package Questions345;
public class Intern extends Employee {
    public static final double MAX_SALARY = 20000.0;

    public Intern(int employeeId, String name, int age, String department, double salary) {
        super(employeeId, name, age, department, validateSalary(salary));
    }

    // Optional getter for MAX_SALARY
    public static double getMaxSalary() {
        return MAX_SALARY;
    }

    // Validate salary so it never exceeds MAX_SALARY
    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds maximum allowed for Intern. Setting to " + MAX_SALARY);
            return MAX_SALARY;
        }
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(validateSalary(salary));
    }

    @Override
    public void giveRaise(double amount) {
        if (amount > 0) {
            double newSalary = getSalary() + amount;
            super.setSalary(validateSalary(newSalary));
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("== Intern Info ==");
        super.displayInfo();
    }
}



