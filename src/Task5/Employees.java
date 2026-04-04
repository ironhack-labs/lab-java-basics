package Task5;

// Employees class with full properties
public class Employees {

    private String name;
    private double salary;
    private int age;
    private int experience; // years of experience
    private String department;

    // Constructor
    public Employees(String name, double salary, int age, int experience, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.experience = experience;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public void setExperience(int experience) {
        if (experience >= 0) this.experience = experience;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void displayInfo() {
        System.out.println("Name: " + name +
                " | Salary: " + salary +
                " | Age: " + age +
                " | Experience: " + experience +
                " | Department: " + department);
    }
}