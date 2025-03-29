public class Employee {
    private String nameEmployee;
    private int age;
    private String positionEmployee;
    private int salaryOfEmployee;


    public Employee(String nameEmployee, int age, String positionEmployee, int salaryOfEmployee) {
        this.nameEmployee = nameEmployee;
        this.age = age;
        this.positionEmployee = positionEmployee;
        this.salaryOfEmployee = salaryOfEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getSalaryOfEmployee() {
        return salaryOfEmployee;
    }

    public int getAge() {
        return age;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void printEmployee(){
        System.out.println("Here is the emplopyees : ");
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public void setSalaryOfEmployee(int salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }
}
