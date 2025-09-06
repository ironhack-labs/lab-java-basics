
// Exercise 3
// Create an Employee class to represent an employee of a company.
// Add all relevant properties and behaviors that you might need
// but you have to include a salary property.
// Don't forget to add getters and setters.


class Employee {
    private String name;
    private String surname;
    private int age;
    private String namePosition;
    private int levelInCompany;
    private int salary;
    private boolean activeWorker;

    public Employee(String name, String surname, int age, String namePosition, int levelInCompany, int salary, boolean activeWorker) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setNamePosition(namePosition);
        setSalary(salary);
        setLevelInCompany(levelInCompany);
        setActiveWorker(activeWorker);
    }

    public Employee(String name, String surname){
        setName(name);
        setSurname(surname);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public int getLevelInCompany() {
        return levelInCompany;
    }

    public void setLevelInCompany(int levelInCompany) {
        this.levelInCompany = levelInCompany;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isActiveWorker() {
        return activeWorker;
    }

    public void setActiveWorker(boolean activeWorker) {
        this.activeWorker = activeWorker;
    }

    public String getEmployeeDetails(){
        return this.name + " " + this.surname + " is " + this.age + " years old. Works as " + this.namePosition + " level " + this.levelInCompany + " with a salary of " + this.salary + " and it's working status is " + this.activeWorker + ".";
    }

    public String getEmployeeFullName(){
        return "The employee full name is " + this.name + " " + this.surname;
    }

  public void offEmployee(){
         this.activeWorker = false;
  }
}



