package Question3;

public class ArrayOfEmployee {
    static void main(String[] args) {
        EmployeeAndSalary emp1 = new EmployeeAndSalary();
        InternEmployee intern1 = new InternEmployee();

        String[] employeeNames = {"Alice", "Bob", "Charlie", "Diana", "Ethan"," Fiona", "George", "Hannah","Lucia"};
        String[] employeePositions = {emp1.AS, emp1.RME, emp1.SDE, emp1.OPS, emp1.HR, emp1.AS, emp1.RME, emp1.SDE, emp1.OPS};
        int[] employeeSalaries = {emp1.AS_SALARY, emp1.RME_SALARY, emp1.SDE_SALARY, emp1.OPS_SALARY, emp1.HR_SALARY, emp1.AS_SALARY, emp1.RME_SALARY, emp1.SDE_SALARY, emp1.OPS_SALARY};

        System.out.println("Employee Details:");
        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Name: " + employeeNames[i]);
            System.out.println("Position: " + employeePositions[i]);
            System.out.println("Salary: $" + employeeSalaries[i]);
            System.out.println();
        }

        System.out.println("Interns Details:");
        intern1.displayInternDetails();
    }
}
