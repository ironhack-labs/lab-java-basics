public class A04_Intern extends A03_Employee {

    public static final double MAX_SALARY = 20000;

    public A04_Intern(String firstName, String lastName, String department, double salary) {
        super(firstName, lastName, department, 0);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Warning: Intern salary cannot exceed " + MAX_SALARY + ". Setting to max.");
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                ", maxSalary=" + MAX_SALARY +
                '}';
    }
}