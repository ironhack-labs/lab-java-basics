public class main {
    public static void main(String[] args) {
        // Create Employee objects
        Employee e1 = new Employee(1, "Swikriti", "Associate", 55000);
        Employee e2 = new Employee(2, "Harsha", "Professor", 48000);

        // Display information
        e1.displayInfo();
        System.out.println("----");
        e2.displayInfo();

        // Update salary
        e1.setSalary(60000);
        System.out.println("Updated Salary for " + e1.getName() + ": " + e1.getSalary());
    }

}
