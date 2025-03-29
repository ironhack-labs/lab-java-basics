package PackageExercise4;

public class Intern extends Employee {
    private final double constant = 20000.00;

    public Intern(String name, int age) {

        super(name, age);
    }

    public Intern(String name, int age, double salary) {
        super(name, age);
        updateInternSalary(salary);
    }


    // method
    public void updateInternSalary(double salary) {
        if (salary > constant) {
            System.out.println("Intern salary can not be greater than 20_000");
            this.salary = constant;
        } else {
            System.out.println("Intern salary is correct");
            this.salary = salary;

        }

    }
}




