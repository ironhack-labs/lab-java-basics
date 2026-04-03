package week2Tasks.Task2;

public class Intern extends Employee {

    public Intern(String name, double salary) {
        super(0, name); 
        this.setSalary(salary); 
    }

    @Override
    public void setSalary(double salary) {
        double MAX_SALARY = 20000;
        if (salary > MAX_SALARY) {
            System.out.println("Warning: Salary for Intern " +  salary + " is too high. Setting to " + MAX_SALARY);
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    public void displayInfo() {
    }
} 
