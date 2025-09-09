package employees;

public class Intern extends Employee{

    public Intern(String fullName, int year, String level, double salary) {
        super(fullName, year, level, salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > 20000) {
            System.out.println("Salary is capped to 20000 for interns!");
            this.salary = 20000;
        } else if (salary < 0) {
            System.out.println("Salary can't be negative!");
        } else {
            this.salary = salary;
        }
    }




}

