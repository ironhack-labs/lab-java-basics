package week2Tasks.Task2;

public class Company {
    public static void main(String[] args) {

        String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        double[] salaries = {35000, 45000, 55000, 30000, 20000, 30000, 40000, 20000, 60000, 65000};

        Employee[] staff = new Employee[10];

        for (int i = 0; i < staff.length; i++) {
            staff[i] = new Employee(salaries[i], names[i]);
        }

        System.out.println("--- Full Employee List ---");
        for (int i = 0; i < staff.length; i++) {
            System.out.println("Employee " + (i + 1) + ": Name = " + staff[i].getName() + ", Salary = " + staff[i].getSalary());
        }



        System.out.println("\n--- Interns ---");
        Intern intern = new Intern("Eleven",  25000);
        intern.displayInfo();
    }
}

