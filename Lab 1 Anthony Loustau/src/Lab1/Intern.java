package Lab1;

public class Intern extends Employee {
    private static final double MAX_SALARY = 20000;

    public Intern(String name, int age, double salary) {
        super(name, age, Math.min(salary, MAX_SALARY));
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds intern limit. Setting salary to " + MAX_SALARY);
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds intern limit. Salary not updated.");
        } else {
            super.setSalary(salary);
        }
    }
}
