public class Intern extends Employee {

    private static final double MAX_SALARY = 20000;

    public Intern(String name, int id, double salary, String department) {
        super(name, id, salary, department);

        if (salary > MAX_SALARY) {
            System.out.println("Salary cannot exceed 20000. Setting to max.");
            super.setSalary(MAX_SALARY);
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary cannot exceed 20000");
        } else {
            super.setSalary(salary);
        }
    }
}