package Employee_Intern;

import java.util.ArrayList;

public class CompanyApplication {

    static void main() {

        Employee employee1 = new Employee("Selim", "Associate", "helvacif", 35000);
        System.out.println(employee1.getName() + " is an " + employee1.getPosition() + " and earns: " + employee1.getSalary() + "€");

        System.out.println("_______________________");

        Intern intern1 = new Intern("Delphine", "Intern", "delbonte", 21000);
        System.out.println(intern1.getName() + " is an " + intern1.getPosition() + " and earns " + intern1.getSalary() + "€");


        intern1.setSalary(30000);
        intern1.setSalary(500);
        intern1.setSalary(600000);

        employee1.asksRaise();
        intern1.asksRaise();

        employee1.takeRest();
        intern1.takeRest();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            employees.add(new Employee ("Employee " + (i+1), "Position " + (i+1), "Employee ID: EI" + (i+1), 30000 + (i*5000)));
        }

        for (Employee employee : employees){
            System.out.println(employee.getName() + " is a "+ employee.getPosition() + " earns " + employee.getSalary());
        }
    }

}
