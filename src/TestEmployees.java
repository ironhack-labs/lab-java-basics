public class TestEmployees {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", "Manager", 50000);


        Trainee trainee1 = new Trainee("Bob", "Intern", 25000);


        Trainee trainee2 = new Trainee("Charlie", "Intern", 18000);


        System.out.println(emp1);
        System.out.println(trainee1);
        System.out.println(trainee2);


        trainee2.setSalary(30000); // обмежиться 20000
        System.out.println("After update: " + trainee2);
    }
}
