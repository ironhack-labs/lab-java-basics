package employees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Intern intern1 = new Intern ("Antonin Dolohov", 2025, "L4", 19000);
        intern1.displayInfo();

        Intern intern2 = new Intern ("Riso Alsugo", 2025, "L4", 25000);
        intern2.displayInfo();


        // program that creates 10 interns and prints all the properties
        Scanner scanner = new Scanner(System.in);

        Employee[] employeeArray = new Employee[10];

        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("Employee n." + (i+1));
            System.out.println("Enter full name: ");
            String fullName = scanner.nextLine();

            System.out.println("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter level: ");
            String level = scanner.nextLine();

            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employeeArray[i] = new Employee(fullName, year, level, salary);
        }

        System.out.println("________________________");
        System.out.println("List of employees");
        System.out.println("________________________");
        for (Employee employee : employeeArray) {
            employee.displayInfo();
        }
        System.out.println("========================");





    }
}
