public class employee {
    private int employeeid;
    private String name;
    private String surname;
    private int age;
    private String job;
    private int salary;


    public employee(int employeeid, String name, String surname, int age, String job, int salary) {
        this.employeeid = employeeid;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
        this.salary = salary;
    }

    public employee() {
    }


    public int getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {

        this.employeeid = employeeid;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }


    public String surname(){
        return  surname;
    }
    public void setsurname(String surname){
        this.surname =surname;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getjob() {
        return job;
    }
    public void setJob() {
        this.job=job;
    }


    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void tenprint(){
        System.out.println("Employeeid:"+ employeeid);
        System.out.println("Name:"+ name);
        System.out.println("Surname:"+ surname);
        System.out.println("Age:"+ age);
        System.out.println("Job:"+ job);
        System.out.println("salary:"+ salary);
    }


}

