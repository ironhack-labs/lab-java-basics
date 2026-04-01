public class Employee {
    private String name;
    private int id;
    private double salary;


    public Employee(String name, int id, double salary) {
        setName(name);
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Name cannot be null or empty!!!!!");
        }
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("ID: " + id + ", Nombre: " + name + ", Salario: " + salary);
    }
}
