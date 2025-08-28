//Create an Employee class to represent an employee of a company. Add all relevant properties and behaviors
//that you might need but you have to include a salary property. Don't forget to add getters and setters.

public class Employee {
    private String name;
    private boolean isRemote;
    private double salary;

    public Employee(String name, boolean isRemote, double salary){
        this.name = name;
        this.isRemote = isRemote;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isRemote=" + isRemote +
                ", salary=" + salary +
                '}';
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean getIsRemote() {
        return isRemote;
    }
    public void setIsRemote(boolean isRemote){
        this.isRemote = isRemote;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    //methods
    public void giveRaise(){
        salary *= 1.05;
    }

    public void changeToRemote(){
        isRemote = true;
    }

    public void removeFromRemote(){
        isRemote = false;
    }

}
