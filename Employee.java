public class Employee {

    private int employeeId;
    private String name;
    private String lastName;
    private int age;
    private String department;
    private String position;
    private double salary;

    public Employee(int employeeId, String name, String lastName, int age, String department, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.position = position;
        setSalary(salary);
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setDepartment(String department) { this.department = department; }
    public void setPosition(String position) { this.position = position; }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "-----------------------------\n"
                + "Employee ID: " + employeeId + "\n"
                + "Name       : " + name + " " + lastName + "\n"
                + "Age        : " + age + "\n"
                + "Department : " + department + "\n"
                + "Position   : " + position + "\n"
                + "Salary     : " + salary;
    }
}
