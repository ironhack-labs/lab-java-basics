public class Main {

    public static void main(String[] args) {

        // Create an array of 10 Employees
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(101, "Alice",   "Johnson", "alice.johnson@company.com",   "Engineering",  "Software Developer",    75000.00, 3);
        employees[1] = new Employee(102, "Bob",     "Smith",   "bob.smith@company.com",       "Marketing",    "Marketing Manager",     65000.00, 7);
        employees[2] = new Employee(103, "Clara",   "Davis",   "clara.davis@company.com",     "HR",           "HR Specialist",         55000.00, 2);
        employees[3] = new Employee(104, "David",   "Wilson",  "david.wilson@company.com",    "Finance",      "Financial Analyst",     70000.00, 5);
        employees[4] = new Employee(105, "Eva",     "Martinez","eva.martinez@company.com",    "Engineering",  "DevOps Engineer",       80000.00, 6);
        employees[5] = new Employee(106, "Frank",   "Brown",   "frank.brown@company.com",     "Sales",        "Sales Representative",  48000.00, 1);
        employees[6] = new Employee(107, "Grace",   "Taylor",  "grace.taylor@company.com",    "Design",       "UX Designer",           62000.00, 4);
        employees[7] = new Employee(108, "Henry",   "Anderson","henry.anderson@company.com",  "Engineering",  "Backend Developer",     78000.00, 8);
        employees[8] = new Employee(109, "Isla",    "Thomas",  "isla.thomas@company.com",     "Legal",        "Legal Counsel",         90000.00, 10);
        employees[9] = new Employee(110, "James",   "Jackson", "james.jackson@company.com",   "Operations",   "Operations Manager",    68000.00, 9);

        // Print all employee profiles
        for (Employee emp : employees) {
            emp.printProfile();
            System.out.println();
        }

        // Summary
        System.out.println("Total employees: " + employees.length);
    }
}