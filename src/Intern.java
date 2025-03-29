public class Intern extends Employee {
    public static final double MAX_SALARY = 20000;


    public Intern(String name, String position, double salary) {
        super(name, position, checkSalary(salary));
    }

    private static double checkSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeds the limit for Interns " + MAX_SALARY);
            return MAX_SALARY;
        }
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Intern salary cannot exceed " + MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
}




