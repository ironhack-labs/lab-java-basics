public class Class2 {
    //array soul
    private String id;
    private String chr1;
    private String chr2;
    private  int salary;

    //getters & setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChr1() {
        return chr1;
    }

    public void setChr1(String chr1) {
        this.chr1 = chr1;
    }

    public String getChr2() {
        return chr2;
    }

    public void setChr2(String chr2) {
        this.chr2 = chr2;
    }

    public int getSalary() {
        return salary;
    }

    public void Salary(int volt) {
        this.salary = volt;
    }
    //constructor
    public Class2(String id, String chr1, String chr2, int salary) {
        this.id = id;
        this.chr1 = chr1;
        this.chr2 = chr2;
        this.salary = salary;
    }
    //toString everything

    @Override
    public String toString() {
        return id+" | "+ chr1 + "\t" + chr2 + "\t" + salary;
    }
}
