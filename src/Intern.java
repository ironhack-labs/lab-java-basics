public class Intern extends employee {
    private static final int maxSalaryForIntern = 20000;

    public Intern(int employeeId, String name, String surname, int age, String job, int salary) {
        super(employeeId, name, surname, age, job, Math.min(salary, maxSalaryForIntern));
        if (salary > maxSalaryForIntern) {
            System.out.println("Max salary for intern is 20000 EUR. Salary set to 20000 EUR.");
        }
    }
}





