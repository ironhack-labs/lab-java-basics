public class Intern extends Employee {
    private int internshipDurationMonths;
    private String universityName;
    private String degreeName;

    public Intern (String name, String surname, double salary, int tenureYears, String role, int internshipDurationMonths, String universityName, String degreeName) {
        super(name, surname, salary, tenureYears, role);
        this.internshipDurationMonths = internshipDurationMonths;
        this.universityName = universityName;
        this.degreeName = degreeName;
    }

    @Override
    public void setSalary(double salary) {
        if (salary > 20000) {
            System.out.println("Intern's salary cannot be higher than 20000.");
            super.setSalary(20000);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public int getTenure() {
        return 0;
    }
}
