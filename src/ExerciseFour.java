public class ExerciseFour {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(1010, "Olu", "Tosin", "tosin@gmail.com",
                "015212099501", "Operational Lead", 45000);

        // Displaying employee details
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Phone: " + emp.getPhoneNumber());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Monthly Salary: $" + emp.getSalary());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());

        // Simulating work
        emp.work();

        // Giving a raise
        emp.raiseSalary(35);
        System.out.println("New Monthly Salary after 35% raise: $" + emp.getSalary());

    }
}
