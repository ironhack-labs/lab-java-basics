public class main3 {
    public static void main(String[] args) {
        // Create an array to hold 10 employees
        Employee[] employees = new Employee[10];

        // Fill with sample employees
        employees[0] = new Employee(1, "Harsha", "Professor", 55000);
        employees[1] = new Employee(2, "Swikriti", "Associate", 48000);
        employees[2] = new Employee(3, "Abhishek", "Manager", 72000);
        employees[3] = new Employee(4, "Diana", "Tester", 40000);
        employees[4] = new Employee(5, "Sudha", "Teacher", 35000);
        employees[5] = new Employee(6, "Saras", "HR", 45000);
        employees[6] = new Employee(7, "Suyash", "Chemist", 50000);
        employees[7] = new Employee(8, "Hannah", "Intern", 20000);
        employees[8] = new Employee(9, "Isha", "Tech Lead", 80000);
        employees[9] = new Employee(10, "Julia", "Product Owner", 90000);

        // Print all employees
        System.out.println("=== Employee List ===");
        for (Employee e : employees) {
            e.displayInfo();
            System.out.println("--------------");
        }
    }
}
