package Question3;

import javax.xml.namespace.QName;

public class Employee {
    private String fullName = "Mark";
    private String position = "Manager";
    private int salary = 3000;

    public Employee(String fullName, String position, int salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }
    public String toString(){
        return "Full name: " + fullName +
                " Position:" + position +
                " Salary:" + salary;
    }

    public String getName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary can not be negative");
        }
    }
    public void displayInfo () {
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
    public void giveRaise (int percent){
    if (percent>0){
        salary += salary * percent / 100;
    }
    }
    public void promote (String newPosition){
        this.position = newPosition;
        System.out.println(fullName +" has been promoted to "+ newPosition);
    }
}