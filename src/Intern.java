public class Intern extends Employee {

    // Create an Intern class that extends
    // from Employee. All the Interns have
    // a salary limit of 20000 (constant).
    // You must validate if an intern is
    // created (or salary updated) with
    // a bigger salary than the max.
    // The max value is set.

    public static final int MAX_SALARY = 20000;

    public Intern(String name, String department, String position, int salary, boolean workingEveryday) {
        super(name, department, position, Math.min(salary, MAX_SALARY), workingEveryday);
    }

    public void setSalary(int salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salary exceeded max intern limit of $" + MAX_SALARY);
        } else {
            super.setSalary(salary); // Call superclass method if valid
        }
    }


}