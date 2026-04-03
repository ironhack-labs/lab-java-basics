public class Intern extends Employee{
    private static final double MAX_SALARY = 20000.0;


    public Intern(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds maximum");
            super.setSalary(MAX_SALARY);
        } else {super.setSalary(salary);}
    }
}
