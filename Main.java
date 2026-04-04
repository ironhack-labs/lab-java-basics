public class Main {

    public static void main(String[] args) {
        System.out.println("===== Exercise 1: Difference =====");
        int[] numbers = {3, 1, 7, 2, 9, 4};
        System.out.println("Difference: " + ArrayUtils.getDifference(numbers));

        System.out.println("\n===== Exercise 2: Two Smallest =====");
        int[] numbers2 = {5, 3, 8, 1, 4, 2};
        ArrayUtils.printTwoSmallest(numbers2);

        System.out.println("\n===== Exercise 3, 4 and 5: Employees =====");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee(1001, "Carlos", "Garcia", 28, "Engineering", "Developer", 35000);
        employees[1] = new Employee(1002, "Laura", "Martinez", 34, "Marketing", "Manager", 42000);
        employees[2] = new Employee(1003, "Pedro", "Lopez", 45, "Finance", "Analyst", 38000);
        employees[3] = new Employee(1004, "Sofia", "Fernandez", 30, "HR", "Recruiter", 31000);
        employees[4] = new Employee(1005, "Miguel", "Sanchez", 52, "Engineering", "Architect", 60000);
        employees[5] = new Employee(1006, "Elena", "Torres", 27, "Sales", "Sales Representative", 28000);
        employees[6] = new Employee(1007, "Javier", "Ruiz", 39, "Engineering", "Team Lead", 55000);
        employees[7] = new Employee(1008, "Ana", "Diaz", 31, "Marketing", "Designer", 33000);
        employees[8] = new Intern(1009, "Pablo", "Moreno", 22, "Engineering", "Intern", 15000);
        employees[9] = new Intern(1010, "Maria", "Jimenez", 21, "Marketing", "Intern", 20000);

        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }

        System.out.println("\nIntern salary validation example:");
        try {
            employees[8].setSalary(25000);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
