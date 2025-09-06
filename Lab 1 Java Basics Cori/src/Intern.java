// Exercise 4
// Create an Intern class that extends from Employee.
// All the Interns have a salary limit of 20000 (constant).
// You must validate if an intern is created (or salary updated)
// with a bigger salary than the max. The max value is set.

class Intern extends Employee{

    int maxSalary = 20000;

    public Intern(String name, String surname) {
        super(name, surname);
    }


    public void setSalary(int salary){
        if (salary > maxSalary){
            super.setSalary(maxSalary);
            System.out.println("New Salary set to: " + maxSalary);
        } else {
            super.setSalary(salary);
        }
    }
}