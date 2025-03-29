public class ExerciseFiveApplication {

        public static void main(String[] args) {
            Intern intern= new Intern(146, "Sten", "Mabel", "sten@gmail.com", "+2387878434", "IT-Specialist Intern", 40000);
            Intern intern2= new Intern(2445, "Sara", "Kie", "kie@hotmail.com", "0492323457", "HR-Specialist Intern", 35000);
            Intern intern3= new Intern(3555, "Luca", "kelvin", "luca@yahoo.com", "+99876345", "Marketing Specialist Intern", 42000);
            System.out.println(intern);
            System.out.println(intern2);
            System.out.println(intern3);
            // Array to hold 10 Employee objects
            Employee[] employees = new Employee[10];

            // Initialize each Employee object with sample data
            employees[0] = new Employee(101, "Alice", "Smith", "alice.smith@example.com",
                    "123-456-7890", "Software Engineer", 70000);
            employees[1] = new Employee(102, "Bob", "Johnson", "bob.johnson@example.com",
                    "234-567-8901", "Data Analyst", 65000);
            employees[2] = new Employee(103, "Charlie", "Williams", "charlie.williams@example.com",
                    "345-678-9012", "Product Manager", 80000);
            employees[3] = new Employee(104, "David", "Brown", "david.brown@example.com",
                    "456-789-0123", "UX Designer", 72000);
            employees[4] = new Employee(105, "Eva", "Davis", "eva.davis@example.com",
                    "567-890-1234", "Quality Assurance", 68000);
            employees[5] = new Employee(106, "Frank", "Miller", "frank.miller@example.com",
                    "678-901-2345", "DevOps Engineer", 75000);
            employees[6] = new Employee(107, "Grace", "Wilson", "grace.wilson@example.com",
                    "789-012-3456", "HR Manager", 71000);
            employees[7] = new Employee(108, "Hannah", "Moore", "hannah.moore@example.com",
                    "890-123-4567", "Marketing Specialist", 69000);
            employees[8] = new Employee(109, "Ian", "Taylor", "ian.taylor@example.com",
                    "901-234-5678", "Sales Executive", 67000);
            employees[9] = new Employee(110, "Jane", "Anderson", "jane.anderson@example.com",
                    "012-345-6789", "Customer Support", 64000);

            // Iterate through the array and print details of each employee
            for (Employee emp : employees) {
                System.out.println(emp);
                System.out.println("-------------------------------");
            }
        }
    }


