public class Employ {
    public String name;
 public String idNumber;
 public String department;
private String salary;
private String level;


 public Employ(String name, String idNumber, String department) {
 this.name = name;
 this.idNumber = idNumber;
 this.department = department;
 }
 public void login() {
 System.out.println("Benvenuto " + name + idNumber + department);
 }
 public String getSalary() {
  return salary;
 }

 public void setSalary(String salary) {
  this.salary = salary;
 }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

