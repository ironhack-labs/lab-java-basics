package org.example;

import java.text.MessageFormat;

public class Employee {
    //Create an Employee class to represent an employee of a company.
    // Add all relevant properties and behaviors that you might need but you have to include a salary property.
    // Don't forget to add getters and setters.

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private double salary;
    private String position;

    // Constructor
    public Employee(String firstName, String lastName, String email, String phoneNumber, double salary, String position) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setPosition(position);
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary<0 ? 0 : salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getSalary() {
        return salary;
    }
    public String getPosition() {
        return position;
    }

// Methods
    public String getInfo() {
        return MessageFormat.format("Name: {0} \nLast Name: {1}\nEmail: {2}\nPhone: {3}\nSalary: {4}\nPosition: {5}", getFirstName(), getLastName(), getEmail(), getPhoneNumber(), getSalary(),getPosition()) ;
    }
}
