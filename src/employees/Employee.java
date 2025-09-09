package employees;

public class Employee {

    String fullName;
    String surname;
    int year; // the year the employee was employed
    String level;
    double salary;

    public Employee(String fullName, int year, String level, double salary) {
        this.fullName = fullName;
        this.year = year;
        this.level = level;
        setSalary(salary);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.printf("%s, %s employed since %d. Salary: %.0f%n", fullName, level, year, salary);
    }
}
