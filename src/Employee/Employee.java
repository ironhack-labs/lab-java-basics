package Employee;

public class Employee {
    private String name;
    private int ID;
    private double salary;
    private String department;

    public Employee(String name, String department, double salary, int ID) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [Name = " + name + ", Department = " + department + ", Salary = " + salary + ", ID = " + ID + "]";
    }
    }



