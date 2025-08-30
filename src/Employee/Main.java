package Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("John", "IT", 50000, 67676);
        employees[1] = new Employee("Chris", "CS", 30000, 12122);
        employees[2] = new Employee("Amanda","HR",27000, 56789);
        employees[3] = new Intern("Sukhwir", "BAR", 22500, 76343);
        employees[4] = new Intern ("Ahmet", "CS,", 45000, 12345);
        employees[5] = new Intern("Frank", "IT", 18000,56743 );
        employees[6] = new Intern("Grace", "HR", 25000,67854 ); // salary capped at 20000
        employees[7] = new Intern("Hank", "Finance", 20000,44544 );
        employees[8] = new Employee("Ivy", "IT", 53000,54373 );
        employees[9] = new Intern("Jack", "Marketing", 15000,33289 );

        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
