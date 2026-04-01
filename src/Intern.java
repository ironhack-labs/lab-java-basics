public class Intern extends Employee {
    // Salary limit constant
    private static final double MAX_SALARY = 20000.0;

    public Intern(String name, int id, double salary) {
        super(name, id, salary);
        // Validate salary on creation
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Intern salary cannot exceed " + MAX_SALARY);
        }
    }

    // Override setter to validate on update
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Intern salary cannot exceed " + MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", salary=" + getSalary() +
                '}';
    }
}