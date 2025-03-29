public class Intern extends Employee{

    private final double MAX_SALARY = 20_000.0;

    public Intern(int employeeId, String firstName, String lastName, String email, String phoneNumber, String jobTitle, double salary) {
        super(employeeId, firstName, lastName, email, phoneNumber, jobTitle, salary);
        if (salary > MAX_SALARY){
            this.setSalary(MAX_SALARY);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "MAX_SALARY=" + MAX_SALARY +
                "} " + super.toString();
    }
}
