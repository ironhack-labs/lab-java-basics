public class Employ {
    // 1. Le proprietà vanno qui (fuori dai metodi)
    public String name;
    public String idNumber;
    public String department;
    private double salary;
    private Integer level;

    // 2. Il costruttore
    public Employ(String name, String idNumber, String department, double salary, Integer level) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.salary = salary;
        this.level = level;
    }

    // 3. I metodi della classe
    public void login() {
        System.out.println("Benvenuto " + this.name);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}