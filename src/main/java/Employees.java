import java.util.ArrayList;

//Write a program that creates 10 Employees and print it al the properties.

public class Employees {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("George Orwell", false, 18500));
        employees.add(new Employee("J.K. Rowling", false, 25000));
        employees.add(new Employee("Harper Lee", true, 34900));
        employees.add(new Employee("Harper Ende", true, 74800));
        employees.add(new Employee("Zion Frank", true, 72300));
        employees.add(new Employee("Linda Harbour", false, 32900));
        employees.add(new Employee("Greta Kinta", false, 57500));

        employees.add(new Intern("Ashley Bronx", true, 34900));
        employees.add(new Intern("Candace Elista", false, 34900));
        employees.add(new Intern("Katie Johnson", false, 16780));

        for (Employee e : employees) {
            System.out.println(e); // now prints all properties nicely
        }
    }
}
