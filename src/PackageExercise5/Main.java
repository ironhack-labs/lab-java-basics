package PackageExercise5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Jack", 1, 20000);
        employees[1] = new Employee("Jacka", 2, 20001);
        employees[2] = new Employee("Jackb", 3, 20002);
        employees[3] = new Employee("Jackc", 4, 20003);
        employees[4] = new Employee("Jackd", 5, 20004);
        employees[5] = new Employee("Jacke", 6, 20005);
        employees[6] = new Employee("Jackf", 7, 20006);
        employees[7] = new Employee("Jackg", 8, 20007);
        employees[8] = new Employee("Jackh", 9, 20008);
        employees[9] = new Employee("Jacki", 10, 20009);



        // Create 10 employees
        for (Employee employee : employees) {
            employee.employeeProfile();
            System.out.println("--------------------------");


        }
    }
}


