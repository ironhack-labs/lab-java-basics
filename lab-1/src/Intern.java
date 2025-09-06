public class Intern extends Employee {
    private static final double MAX_SALARY = 20000;

    public Intern(String name, int id, String department, double salary, boolean isEmployed) {
        super(name, id, department, validateSalary(salary), isEmployed);
        super.setEmployed(isEmployed);
    }
    public Intern(String name, int id, String department, double salary) {
        this(name, id, department, salary, true);
    }
    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds the limit for an Intern. Setting to " + MAX_SALARY);
            return MAX_SALARY;
        }
        return salary;
    }
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds limit for an Intern. Setting to within " + MAX_SALARY);
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
    public String toString() {
        return "Intern [ID=" + getId() + ", Name=" + getName() + ", Department=" + getDepartment()
                + ", Salary=" + getSalary() + ", Employed=" + isEmployed() + "]";
    }
}
