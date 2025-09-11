public class Intern extends Employee{
    public static final double MAX_SALARY = 20000.0;

    // Constructor
    public Intern(int id, String name, String role, double salary) {
        // Set a temporary salary (0), then use our overridden setter
        // so the validation (cap) is applied.
        super(id, name, role, 0);
        setSalary(salary);  // will validate against MAX_SALARY
    }

    // Override setSalary to enforce the cap
    @Override
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative!");
            return;
        }
        if (salary > MAX_SALARY) {
            System.out.println("Intern salary cannot exceed " + MAX_SALARY+".");
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    // (Optional) A helper to show it's an intern when printing
    @Override
    public void displayInfo() {
        System.out.println("=== Intern ===");
        super.displayInfo();
        System.out.println("Intern Max Salary: " + MAX_SALARY);
    }
}

