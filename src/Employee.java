 public class Employee {
    private String name;
    private String surname;
    private double salary;
    private int tenureYears;
    private String role;

    public Employee(String name, String surname, double salary, int tenureYears, String role) {
        this.name = name;
        this.surname = surname;
        setSalary(salary);
        this.tenureYears = tenureYears;
        this.role = role;
    }

    // Getter get name
    public String getFullName() {
        return name + " " + surname;
    }

    // Getter get salary
     public double getSalary() {
         return salary;
     }

     // Getter get role
     public String getRole() {
         return role;
     }

     // Getter get tenure
     public int getTenure() {
         return tenureYears;
     }

     // Setter set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method work
    public void work() {
        System.out.println("Work completed");
    }

    // Method business trip
    public void buisnessTrip() {
        System.out.println("Business trip completed");
    }

    // Method get paid
    public void getPaid() {
        System.out.println("Salary received");
    }
}
