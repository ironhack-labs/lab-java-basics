import java.util.Scanner;

public class Employee {

    // Define employee properties
    private String name;
    private int age;
    boolean isActive;
    private double salary;

    // Set properties of employee
    public Employee(String name, int age, boolean isActive, double salary) {
        setName(name);
        setAge(age);
        setActive(isActive);
        setSalary(salary);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Intern extends Employee {
    // Set properties of Intern
    // Using super to get properties from Employee class
    public Intern(String name, int age, boolean isActive, double salary) {
        super(name, age, isActive, salary);
    }


    // Custom setSalary to check if intern
    // has higher salary than 20000
    public void setSalary(double salary) {
        double maxInternSalary = 20000;

        // If salary is higher than maxInternSalary
        if(salary > maxInternSalary){
            // Print warning that salary exceeds limit
            // Set salary to maxInternSalary
            System.out.println("!!! [INTERN] " + getName() + "'s salary exceeds maximum salary of €" + maxInternSalary + " (€" + salary + ")");
            System.out.println("!!! Type \"continue\" to set " + getName() + "'s salary to €" + maxInternSalary + " or \"edit\" to change " + getName() + "'s salary");
            Scanner sc = new Scanner(System.in);
            String validate = sc.nextLine();

            // Continue by automatically setting the salary to the maxInternSalary
            if(validate.equals("continue")){
                System.out.println("!!! Setting " + getName() + "'s salary to €" + maxInternSalary);
                super.setSalary(20000);
            }
            // Edit the salary manually
            else if(validate.equals("edit")){
                System.out.println("Enter the new salary for " + getName());
                double newSalary = sc.nextDouble();
                super.setSalary(newSalary);
            }
        }
        // Set salary as passed
        else {
            super.setSalary(salary);
        }
    }
}