public class Task5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Alice", "Manager", 50000);
        employees[1] = new Employee("Bob", "Developer", 40000);
        employees[2] = new Employee("Charlie", "Tester", 30000);
        employees[3] = new Trainee("David", "Intern", 25000); // salary limited
        employees[4] = new Trainee("Eva", "Intern", 18000);
        employees[5] = new Employee("Frank", "HR", 35000);
        employees[6] = new Employee("Grace", "Developer", 42000);
        employees[7] = new Employee("Hank", "Designer", 37000);
        employees[8] = new Employee("Ivy", "Support", 28000);
        employees[9] = new Employee("Jack", "Analyst", 45000);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
