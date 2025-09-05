package Question3;

public class InternEmployee extends EmployeeAndSalary {
    String intern = "Interns";
    String[] employeeIntern = {"Patrick", "Mohammad"};
    int INTERN_SALARY = 800;
    int MAX_SALARY = 20000;

    public void displayInternDetails() {
        System.out.println("Name: " + employeeIntern[0]+", " + employeeIntern[1]);
        System.out.println("Position: " + intern);
        System.out.println("Salary: $" + INTERN_SALARY);
        System.out.println("Interns salary not exceed the salary limit : " + (INTERN_SALARY !=  MAX_SALARY && INTERN_SALARY < MAX_SALARY));
    }
}
