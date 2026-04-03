public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String jobTitle;
    private double salary;
    private int yearsOfExperience;
    private boolean isActive;

    public Employee(int id, String firstName, String lastName,
            String email, String department,
            String jobTitle, double salary, int yearsOfExperience) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = true; // new employees are active by default
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative. No changes made.");
            return;
        }
        this.salary = salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience < 0) {
            System.out.println("Years of experience cannot be negative. No changes made.");
            return;
        }
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Returns the employee's full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Applies a raise by percentage (e.g. 10 = 10% raise)
    public void applyRaise(double percentage) {
        if (percentage <= 0) {
            System.out.println("Raise percentage must be positive.");
            return;
        }
        double raise = salary * (percentage / 100);
        salary += raise;
        System.out.printf("Raise applied! " + getFullName() + "'s new salary: " + salary);
    }

    // Transfers the employee to a new department with an optional new job title
    public void transferTo(String newDepartment, String newJobTitle) {
        System.out.printf(
                getFullName() + " transferred from " + department + " to " + newDepartment + " as " + newJobTitle);
        this.department = newDepartment;
        this.jobTitle = newJobTitle;
    }

    // Marks the employee as inactive (resigned / terminated)
    public void terminate() {
        this.isActive = false;
        System.out.println(getFullName() + " has been marked as inactive.");
    }

    // Prints a formatted summary of the employee to the console
    public void printProfile() {
        System.out.println("         Employee Profile         ");
        System.out.println("ID              : " + id);
        System.out.println("Name            : " + getFullName());
        System.out.println("Email           : " + email);
        System.out.println("Department      : " + department);
        System.out.println("Job Title       : " + jobTitle);
        System.out.println("Salary          : " + salary);
        System.out.println("Experience      : " + yearsOfExperience + " year(s)");
        System.out.println("Status          : " + (isActive ? "Active" : "Inactive"));
    }

    public static void main(String[] args) {

        // Create an employee
        Employee emp = new Employee(
                101, "Alice", "Johnson", "alice@company.com",
                "Engineering", "Software Developer", 75000.00, 3);

        // Print initial profile
        emp.printProfile();

        // Apply a 10% raise
        emp.applyRaise(10);

        // Transfer to a new department
        emp.transferTo("Product", "Product Engineer");

        // Try setting an invalid salary
        emp.setSalary(-5000);

        // Print updated profile
        emp.printProfile();

        // Terminate the employee
        emp.terminate();
        System.out.println("Is Active: " + emp.isActive());
    }
}