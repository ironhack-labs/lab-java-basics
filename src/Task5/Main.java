package Task5;

public class Main {

    public static void main(String[] args) {

        Object[][] data = {
                {"Saba", 59000.0, 31, 2, "AI"},
                {"Hadi", 58000.0, 33, 3, "IT"},
                {"Sepehr", 48000.0, 28, 3, "Marketing"},
                {"Sohrab", 49000.0, 40, 15, "HR"},
                {"Siavash", 52000.0, 32, 7, "IT"},
                {"Fereydoon", 47000.0, 27, 2, "Finance"},
                {"George", 53000.0, 34, 8, "Marketing"},
                {"Pooran", 49000.0, 29, 4, "HR"},
                {"Sara", 51000.0, 31, 6, "IT"},
                {"Parsa", 56000.0, 38, 12, "Finance"},
                {"Babak", 56000.0, 38, 12, "Marketing"}
        };

        Employees[] employees = new Employees[data.length];

        for (int i = 0; i < data.length; i++) {
            String name = (String) data[i][0];
            double salary = (double) data[i][1];
            int age = (int) data[i][2];
            int exp = (int) data[i][3];
            String dept = (String) data[i][4];

            employees[i] = new Employees(name, salary, age, exp, dept);
        }

        for (Employees emp : employees) {
            emp.displayInfo();
        }
    }
}