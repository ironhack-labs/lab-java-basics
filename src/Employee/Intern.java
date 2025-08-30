package Employee;

public class Intern extends Employee{
    private static final double MAX_SALARY = 20000.0;

    public Intern(String name, String department, double salary, int ID) {
        super(name, department, Math.min(salary, MAX_SALARY), ID);
        if (salary > MAX_SALARY) {
            System.out.println("Intern salary cant exceed " + MAX_SALARY + "setting to MAX");
        }
    }
}
