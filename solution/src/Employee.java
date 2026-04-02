public class Employee {
    protected double salary;
    private int employeeId;
    private String name;
    private String jobTitle;
    private double tenureYears;
//constructor
    public Employee(int employeeId, String name, String jobTitle, double tenureYears, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.jobTitle = jobTitle;
        this.tenureYears = tenureYears;
        this.salary = salary;

    }
//method
    public boolean canTakeLeaveOfAbsence(){
        return tenureYears >= 2;
    }
//getter

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getTenureYears() {
        return tenureYears;
    }

    //setter

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setName(String name) {
        this.name = name;
    }
}
