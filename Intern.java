public class Intern extends Employee {

    public static final double MAX_SALARY = 20000;

    public Intern(int employeeId, String name, String lastName, int age, String department, String position, double salary) {
        super(employeeId, name, lastName, age, department, position, 0);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Intern salary cannot exceed " + MAX_SALARY + ".");
        }
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole       : Intern\nSalary cap : " + MAX_SALARY;
    }
}
