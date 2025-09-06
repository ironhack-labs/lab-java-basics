public class Trainee extends Employee {
    private static final double MAX_SALARY = 20000;

    public Trainee(String name, String position, double salary) {
        super(name, position, validateSalary(salary));
    }

    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            return MAX_SALARY;
        }
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(validateSalary(salary));
    }
}
