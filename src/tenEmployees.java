public class tenEmployees {
    public static void main(String[] args) {
        employee[] emp = new employee[10];

        emp[0] = new employee(1, "John", "Smith", 30, "Software Developer", 30000);
        emp[1] = new employee(1, "Emily", "Johnson", 32, "Software Engineer", 390000);
        emp[2] = new employee(1, "Michael", "Brown", 36, "Senior Software developer", 60000);
        emp[3] = new employee(1, "Sarah", "Williams", 31, "Fullstacks developer", 41000);
        emp[4] = new employee(1, "David", "Jones", 25, "Lead Software Engineer", 60000);
        emp[5] = new employee(1, "Olivia", "Taylor", 27, "Frontend-Developer", 33000);
        emp[6] = new employee(1, "James", "Wilson", 22, "Backend-Developer", 38000);
        emp[7] = new employee(1, "Emma", "Davis", 29, "Software Architect", 32000);
        emp[8] = new employee(1, "Christopher", "Miller", 31, "Backend-Developer", 38000);
        emp[9] = new employee(1, "Sophia", "Moore", 24, "Frontend-Developer", 32000);

        for (employee tenemp : emp) {
            tenemp.tenprint();
        }

    }
}

