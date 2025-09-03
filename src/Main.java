class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Noah", "Quality Assurance",
                " Controller", 35000, true);
        employee1.displayEmployeeInfo();

        Employee employee2 = new Employee("Cole", "IT",
                " Cloud Engineer", 20000, true);
        employee2.displayEmployeeInfo();

        Employee employee3 = new Employee("Tola", "Operations",
                " Manager", 30000, true);
            employee3.displayEmployeeInfo();

        Employee employee4 = new Employee("Bukunmi", "Problem Solve",
                " Associate", 22000, true);
        employee4.displayEmployeeInfo();

        Employee employee5 = new Employee("Funmilola", "Receiving",
                " Associate", 28000, true);
        employee5.displayEmployeeInfo();

        Employee employee6 = new Employee("Bolanle", "Sorting",
                " Sortation Associate", 14000, true);
        employee6.displayEmployeeInfo();

        Employee employee7 = new Employee("Bolajoko", "Recruitment",
                " Recruitment Assistant", 11000, true);
        employee7.displayEmployeeInfo();

        Employee employee8 = new Employee("Abdul", "Delivery",
                " Delivery Man", 8000, true);
        employee8.displayEmployeeInfo();

        Employee employee9 = new Employee("Abby", "Learning",
                " Trainer", 36000, true);
        employee9.displayEmployeeInfo();

        Employee employee10 = new Employee("Adejare", "Instructing",
                " Instructor", 8000, true);
        employee10.displayEmployeeInfo();




        // Interns child from Employee Parent Class

        Intern intern1 = new Intern("Tolu", "HR", "HR Intern", 18000, true);
        intern1.displayInternInfo();
        intern1.setSalary(50000);

        Intern intern2 = new Intern("Lovey", "Finance", "Finance Intern", 26000, true);
        intern2.displayInternInfo();


        Intern intern3 = new Intern("Lovey", "Finance", "Finance Intern", 25000, true);
        intern3.displayInternInfo();





    }


}