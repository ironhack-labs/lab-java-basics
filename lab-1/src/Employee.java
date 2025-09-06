public class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;
    private boolean isEmployed;

    public Employee(String name, int id, String department, double salary, boolean isEmployed) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.isEmployed = isEmployed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Boolean isEmployed() {
        return isEmployed;
    }
    public void setEmployed (boolean employed) {
        this.isEmployed = employed;
    }
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + department
                + ", Salary=" + salary + ", Employed=" + isEmployed + "]";
    }
}
