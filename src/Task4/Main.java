package Task4;

public class Main {

    public static void main(String[] args) {

        Intern intern1 = new Intern("Parsa", 15000);
        intern1.displayInfo();

        System.out.println("Trying to increase salary to 25000");
        intern1.setSalary(25000); // Should not change
        intern1.displayInfo();

        System.out.println("Updating salary to 18000");
        intern1.setSalary(18000); // Should apply
        intern1.displayInfo();
    }
}