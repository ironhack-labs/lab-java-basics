package Task3;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Hadi";
        emp1.salary = 3000;

        emp1.displayInfo();

        System.out.println("---- After Increase ----");

        emp1.increaseSalary(500);
        emp1.displayInfo();
    }
}