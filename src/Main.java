import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {

                new Intern("Salavatore", "Senior Sofware Dev", 30000),
                new Employee("Elodie", "HR", 20000),
                new Employee("David", "Junior Sofware Dev", 15000),
                new Employee("Tosin", "Sofware Dev", 18000),
                new Employee("Colin", "Junior Sofware Dev", 15000),
                new Employee("Rosca", "It", 19000),
                new Employee("Ahmad", "Web Dev", 16000),
                new Employee("Tino", "Web Dev", 16000),
                new Employee("Kasia", "Senior Web Dev", 19000),
                new Employee("Cesar", "Senior Web Dev", 18000)
        };

        for (Employee emp : employees) {
            emp.displayDetails();
        }

    }

}