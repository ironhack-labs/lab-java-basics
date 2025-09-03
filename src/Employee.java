//Create an Employee class to represent
// an employee of a company. Add all relevant
// properties and behaviors that you might need
// but, you have to include a salary property.
// Don't forget to add getters and setters.

public class Employee {
    private String name;
    private String department;
    private String position;
    private int salary;
    private boolean workingEveryday;


    public Employee (String name, String department, String position, int salary, boolean workingEveryday){
        this.name = (name);
        this.department = (department);
        this.position = (position);
        this.salary = (salary);
        this.workingEveryday = (true);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
       this.salary = salary;
    }

    public boolean getWorkingEveryday() {
        return workingEveryday;
    }

    public void setWorkingEveryday(boolean isWorkingEveryday) {
        this.workingEveryday = true;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Works Everyday: " + true);
    }

    public void displayInternInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
        System.out.println("Works Everyday: " + true);
    }



}

