public class Employee {
    // Properties
    private String name;
    private int age;
    private String position;
    private double salary;

    // Constructor
    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee info
    public void printInfo() {
        System.out.println("Name: " + name +
                ", Age: " + age +
                ", Position: " + position +
                ", Salary: " + salary);
    }
}
