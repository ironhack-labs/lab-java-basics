package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

//      Exercise 1
        System.out.println("Exercise 1: Find the difference between the min and max elements of an array");

        int[] numArray = {-1,-20,1,5,6,7,9999,-3000};
        System.out.println("Array: " + Arrays.toString(numArray));

        int diff = ArrayMath.getDiffOfMaxMinFrom(numArray);
        System.out.println("Diff: " + diff);

        // Add new line
        System.out.println("\n");

//      Exercise 2
        System.out.println("Exercise 2: Print on console the 2 minimum elements of an array");
        int[] numArray2 = {-1,-20,1,5,6,7,9999,-3000};
        System.out.println("Array: " + Arrays.toString(numArray2));

        ArrayMath.getTwoSmallestNumbersFrom(numArray2);

        // Add new line
        System.out.println("\n");

//      Exercise 3
        System.out.println("Exercise 3: Create an Employee class");
        Employee employeeExample = new Employee(
                "Konstantinos",
                "Leivaditis",
                "example@gmail.com",
                "696114321",
                28000,
                "Junior S&OP Analyst");

        System.out.println("Employee: \n" + employeeExample.getInfo());

        // Add new line
        System.out.println("\n");

//      Exercise 4
        System.out.println("Exercise 4: Create an Intern class extending from Employee. Interns cant get salary more than 20000.");
        Intern intern = new Intern(
                "Konstantinos",
                "Leivaditis",
                "example@gmail.com",
                "696114321",
                28000,
                "Junior S&OP Analyst");

        // Set salary over max
        intern.setSalary(2000000);
        
        System.out.println("Set intern salary to: " + 2000000);
        System.out.println("Intern: \n" + intern.getInfo());

        // Add new line
        System.out.println("\n");

//      Exercise 5
        System.out.println("Exercise 5: Create 5 employees");

        List<Employee> employees = new ArrayList<>(5);

        employees.add(new Employee ("Konstantinos",
                "Leivaditis",
                "example@gmail.com",
                "696114321",
                28000,
                "Junior S&OP Analyst"));

        employees.add(new Employee ("Nick",
                "Chair",
                "example@gmail.com",
                "696114321",
                70000,
                "S&OP Analyst III"));

        employees.add(new Employee ("Sonia",
                "ABA",
                "example@gmail.com",
                "696114321",
                60000,
                "S&OP Analyst II"));

        employees.add(new Employee ("Hsien",
                "Conte",
                "example@gmail.com",
                "696114321",
                60000,
                "iOS Developer II"));

        employees.add(new Intern ("Guido",
                "Arnau",
                "example@gmail.com",
                "696114321",
                30000,
                "Intern S&OP Analyst"));

        int flag = 1;
        for (Employee employee : employees) {
            System.out.println("Employee number " + flag + ":\n" + employee.getInfo() + "\n");
            flag++;
        }

    }
}