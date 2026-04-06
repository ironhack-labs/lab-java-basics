package Employee_Intern;

public class Employee {
    private String name;
    private String position;
    private String employeeID;
    private double salary;

    public Employee(String name, String position, String employeeID, double salary) {
        this.name = name;
        this.position = position;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void asksRaise(){
        System.out.println(name + " requests a salary raise");
    }

    public void takeRest() {
        System.out.println(name + " is taking some reste");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}