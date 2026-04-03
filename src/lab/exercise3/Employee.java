package lab.exercise3;

public class Employee {

    //Ponemos atributos al empleado (en privado)
    private String name;
    private int age;
    private double salary;
    private boolean isFullTime;
    private char shift;

    //Creamos el constructor(cuando cree un empleado, me das estos datos)
    public Employee(String name, int age, double salary, boolean isFullTime, char shift) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.shift = shift;
    }

    //Creamos los Getter ( para leer u obtener los datos)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isFullTime() { //en boolean es importante el "is" en vez del "get"
        return isFullTime;
    }

    public char getShift() {
        return shift;
    }

    //Creamos los Setter si luego queremos modificar los datos
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFullTime(boolean fullTime) {
        this.isFullTime = fullTime;
    }

    public void setShift(char shift) {
        this.shift = shift;
    }

    // ahora creamos el @OVERRRIDE para imprimir LIMPIO
    @Override
    public String toString() {
        return "Employee --> {" +
                "name : " + name +
                ", age : " + age +
                ", salary : " + salary +
                ", isFullTime : " + isFullTime +
                ", shift : " + shift + "}";

    }

}