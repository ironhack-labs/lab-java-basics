import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= TASK 1 & 2 =========");
        // Call maxMinDiff method
        maxMinDiff();

        System.out.println("\n========= TASK 3 & 4 =========");
        // Create array of Employee objects using ArrayList
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", 21, true, 23845));
        employees.add(new Employee("Ben", 25, true, 21943));
        employees.add(new Employee("Charlie", 23, false, 0));
        employees.add(new Intern("David", 28, true, 18500));
        employees.add(new Employee("Elizabeth", 22, true, 19945));
        employees.add(new Employee("Frank", 26, true, 22345));
        employees.add(new Employee("George", 27, true, 23845));
        employees.add(new Intern("Hannah", 22, true, 18500));
        employees.add(new Intern("Isabella", 23, true, 18500));
        employees.add(new Intern("Jack", 24, true, 21900));

        // For loop to print employee information
        for (Employee employee : employees) {
            // if employee is an intern
            if (employee instanceof Intern) {
                // Print intern information
                System.out.println("\nIntern:" + "\nName: " + employee.getName() + "\nAge: " + employee.getAge() + "\nIs active: " + employee.isActive() + "\nSalary: €" + employee.getSalary());
            }
            // if employee is not an intern
            else {
                // Print employee information
                System.out.println("\nEmployee:" + "\nName: " + employee.getName() + "\nAge: " + employee.getAge() + "\nIs active: " + employee.isActive() + "\nSalary: " + employee.getSalary());
            }
        }
    }

    // Method to print maximum, minimum and difference between highest and lowest numbers in an array
    public static void maxMinDiff() {
        // Creating array using ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(23);
        numbers.add(12);
        numbers.add(18);

        // Print the numbers array as string
        System.out.println("Numbers: " + numbers);

        // Define variables
        int highestNumber = 0;
        int lowestNumber = Integer.MAX_VALUE;
        int secondLowestNumber = Integer.MAX_VALUE;

        // For loop going through all numbers in array
        for (int number : numbers) {
            // if current number is higher than highestNumber
            // set highestNumber to current number
            if(number > highestNumber){
                highestNumber = number;
            }

            // if current number is lower than lowestNumber
            // set lowestNumber to current number
            if(number < lowestNumber){
                lowestNumber = number;
            }
        }

        // For loop again to get the second-lowest number
        for (int number : numbers) {
            // if current number is lower than secondLowestNumber and
            // higher than lowestNumber, set secondLowestNumber to current number
            if(number < secondLowestNumber && number > lowestNumber){
                secondLowestNumber = number;
            }
        }

        // Print results
        System.out.println("Highest number: " + highestNumber);
        System.out.println("Lowest number: " + lowestNumber);
        System.out.println("Difference between highest and lowest numbers: " + (highestNumber-lowestNumber));
        System.out.println("Second-lowest number: " + secondLowestNumber);

    }
}
