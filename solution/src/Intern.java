public class Intern extends Employee{
// constructor
    public Intern(int employeeId, String name, String jobTitle, double tenureYears, double salary){
        super(employeeId, name, jobTitle, tenureYears, salary > 20000 ? 20000 : salary);
    }
    @Override
    public void setSalary(double salary) {
        this.salary = salary > 20000 ? 20000 : salary;
    }
}
