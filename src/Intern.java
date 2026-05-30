public class Intern extends Employee {
    public static final double MAX_SALARY = 20000;

    public Intern(String name, int age, String position, double salary) {
        super(name, age, position, salary);

        if (salary > MAX_SALARY) {
            setSalary(MAX_SALARY);
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
}