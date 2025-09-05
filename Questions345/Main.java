package Questions345;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(313, "Jason Smith", 45, "IT", 60000 );
        employees[1] = new Employee(205, "Alice Jones", 34, "HR", 36000 );
        employees[2] = new Employee(101, "Max Backer", 25, "Finance", 53000);
        employees[3] = new Employee(203, "Amanda Gilmore", 40,"Marketing", 55000);
        employees[4] = new Employee(105, "Lilian Dalton", 30, "Sales", 56000);
        employees[5] = new Employee(308, "Henry Decker", 35,"HR Manager",65000);
        employees[6] = new Employee(103, "Emily Wu", 29, "IT",65000);
        employees[7] = new Employee(210, "Taylor Wiggins", 33, "Marketing", 58000);
        employees[8] = new Employee(305, "Liana Barber", 22, "Finance", 20000);
        employees[9] = new Employee(113, "Brodie Harding", 50, "Manager", 80000);

        System.out.println("=== Employee List ===");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(" Employee #" + (i + 1));
            employees[i].displayInfo();
            System.out.println("----------------------");
        }

    }
}
