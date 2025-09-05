public class Intern extends Employee {
    public static final double MAX_SALARY = 20000;

    public Intern(String name, int age, String position, double salary) {
        super(name, age, position, 0); // start with 0, then set salary with validation
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds the maximum for interns. Setting to " + MAX_SALARY);
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
}
