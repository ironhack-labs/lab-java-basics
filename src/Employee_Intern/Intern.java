package Employee_Intern;

public class Intern extends Employee {
    private final double MAX_SALARY = 20000;

    public Intern(String name, String position, String employeeID, double salary) {
        super(name, position, employeeID, Math.min(salary, 20000.0));
    }

    @Override
    public void setSalary(double salary) {
        if (salary <= MAX_SALARY) {
            super.setSalary(salary);
            System.out.println("Actualised salary is: " + salary);
        } else {
            System.out.println("Error: intern salary exceeded maximum authorized (max.20000)");
        }
    }
}
