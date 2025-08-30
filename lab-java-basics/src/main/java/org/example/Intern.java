package org.example;

public class Intern extends Employee {
//    Create an Intern class that extends from Employee.
//    All the Interns have a salary limit of 20000 (constant).
//    You must validate if an intern is created (or salary updated) with a bigger salary than the max.
//    The max value is set.

    public Intern(String firstName, String lastName, String email, String phoneNumber, double salary, String position) {
        super(firstName,
                lastName,
                email,
                phoneNumber,
                (salary<20000) ? salary : 20000,
                position);
    }

    @Override public void setSalary(double salary) {
        super.setSalary((salary<20000) ? salary : 20000);
    }
}
