public class A05_EmployeeList {

    public static void printEmployees() {
        A03_Employee[] employees = {
                new A03_Employee("Alice", "Smith", "Engineering", 55000),
                new A03_Employee("Bob", "Jones", "Marketing", 48000),
                new A03_Employee("Carlos", "Garcia", "Engineering", 62000),
                new A03_Employee("Diana", "Lee", "HR", 45000),
                new A03_Employee("Eva", "Muller", "Finance", 70000),
                new A04_Intern("Frank", "Brown", "Engineering", 18000),
                new A04_Intern("Grace", "Wilson", "Marketing", 25000),
                new A03_Employee("Hana", "Kim", "Finance", 67000),
                new A03_Employee("Ivan", "Petrov", "Engineering", 58000),
                new A04_Intern("Julia", "Rossi", "HR", 15000)
        };

        for (A03_Employee e : employees) {
            System.out.println(e);
        }
    }
}
