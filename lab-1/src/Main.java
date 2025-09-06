//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees_list = new Employee[10];

        employees_list[0] = new Employee("Vanessa", 1, "HR", 50000, true);
        employees_list[1] = new Employee("Vanessa_2", 2, "HR", 70000, true);
        employees_list[2] = new Employee("Vanessa_3", 3, "HR", 45000, true);
        employees_list[3] = new Employee("Vanessa_4", 4, "HR", 52000, true);
        employees_list[4] = new Employee("Vanessa_5", 5, "HR", 50000, true);
        employees_list[5] = new Employee("Vanessa_6", 6, "HR", 50000, true);
        employees_list[6] = new Employee("Vanessa_7", 7, "HR", 50000, false);
        employees_list[7] = new Employee("Vanessa_8", 8, "HR", 50000, false);
        employees_list[8] = new Intern("Vanessa_9", 9, "HR", 21000, true);
        employees_list[9] = new Intern("Audrey", 10, "HR", 15000, true);

        for (Employee emp : employees_list) {
            System.out.println(emp);
        }
    }
}