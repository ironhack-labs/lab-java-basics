public class Employee {
    private int id;
    private String name;
    private String role;
    private double salary;

    // --- Constructor ---
    public Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // --- Getters (to read values) ---
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    // --- Setters (to update values) ---
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {          // basic validation
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }


    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}
