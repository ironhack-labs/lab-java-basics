public class EmployeeFactory {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        String [] names = {"Alice", "Liam", "Pierre", "Olivia", "Mary", "Daniel", "Lando", "George", "Charles", "Emma"};
        String [] surnames = {"Norris", "Ricardo", "Hamilton", "Gasly", "Lawson", "Leclerc", "Tsunoda", "Russel", "Verstappen", "Alonso"};
        double [] salaries = {300000.50, 4500000.65, 420500.50, 550500.45, 280150.50, 360600.75, 450100.10, 500500.50, 420200.20, 350500.50};
        int [] tenuresYears = {5, 4, 7, 4, 6, 3, 2, 8, 9, 11};
        String [] roles = {"Main Driver", "Backup Driver", "Mechanic", "Engineer", "Team Principal", "Strategist", "Physiotherapist", "Logistical Planner", "Operations Manager", "Sponsor Relations Manager"};

        for (int i = 0; i < 10; i++) {
            employees[i] = new Employee (
                    names[i],
                    surnames[i],
                    salaries[i],
                    tenuresYears[i],
                    roles[i]
            );
        }
        for (Employee employee : employees) {
            System.out.println("\nFull name: " + employee.getFullName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Tenure in years: " + employee.getTenure());
        }
        System.out.println("\nIntern information:");

        Intern jerry = new Intern("Jerry", "Smith", 200650.00, 1, "Intern", 6, "UPC", "engineering");
        System.out.println("Intern's tenure is " + jerry.getTenure());
        System.out.println("Intern's salary is " + jerry.getSalary());
    }
}
