package PackageExercise5;

public class Employee {
    private String name;
    private int id;
    private double salary;

    //constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void employeeProfile() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);

    }



}
