public class Intern extends Employee {

    public static final double MAX_SALARY = 20000.00;
    private String university;
    private String internshipField;
    private int durationMonths;

    public Intern(int id, String firstName, String lastName,
            String email, String department,
            double salary, String university,
            String internshipField, int durationMonths) {

        // Pass "Intern" as the fixed job title up to Employee
        super(id, firstName, lastName, email, department,
                "Intern", validateSalary(salary), 0);

        this.university = university;
        this.internshipField = internshipField;
        this.durationMonths = durationMonths;
    }

    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {

            System.out.println("Warning: Salary " + salary + " cannot exceed intern limit. Salary has been capped at "
                    + MAX_SALARY + ".");
            return MAX_SALARY;
        }
        if (salary < 0) {
            System.out.println("Warning: Salary cannot be negative. ");
            return 0;
        }
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(validateSalary(salary));
    }

    @Override
    public void applyRaise(double percentage) {
        if (percentage <= 0) {
            System.out.println("Raise percentage must be positive.");
            return;
        }
        double raisedSalary = getSalary() * (1 + percentage / 100);
        if (raisedSalary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
            System.out.println(
                    "Raise applied but capped at intern limit. " + getFullName() + "'s new salary: " + MAX_SALARY);
        } else {
            super.setSalary(raisedSalary);
            System.out.println("Raise applied! " + getFullName() + "'s new salary: " + getSalary());
        }
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getInternshipField() {
        return internshipField;
    }

    public void setInternshipField(String internshipField) {
        this.internshipField = internshipField;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        if (durationMonths <= 0) {
            System.out.println("Duration must be at least 1 month. No changes made.");
            return;
        }
        this.durationMonths = durationMonths;
    }

    @Override
    public void printProfile() {
        System.out.println("          Intern Profile          ");
        System.out.println("ID              : " + getId());
        System.out.println("Name            : " + getFullName());
        System.out.println("Email           : " + getEmail());
        System.out.println("Department      : " + getDepartment());
        System.out.println("Field           : " + internshipField);
        System.out.println("University      : " + university);
        System.out.println("Duration        : " + durationMonths + " month(s)");
        System.out.println("Salary          : $" + getSalary());
        System.out.println("Status          : " + (isActive() ? "Active" : "Inactive"));
        System.out.println("===================================");
    }

    public static void main(String[] args) {

        System.out.println(">>> Creating intern with valid salary ($15000):");
        Intern intern1 = new Intern(
                201, "Bob", "Smith", "bob@company.com",
                "Engineering", 15000,
                "TU Munich", "Software Engineering", 6);
        intern1.printProfile();

        System.out.println(">>> Creating intern with salary ABOVE the limit ($25000):");
        Intern intern2 = new Intern(
                202, "Sara", "Lee", "sara@company.com",
                "Marketing", 25000,
                "LMU Munich", "Digital Marketing", 3);
        intern2.printProfile();

        System.out.println(">>> Trying to update salary above limit via setSalary():");
        intern1.setSalary(22000);
        System.out.println("Salary after update: $" + intern1.getSalary());

        System.out.println(">>> Applying a raise that stays within the limit:");
        intern1.setSalary(15000);
        intern1.applyRaise(10); // 15000 + 10% = 16500 → within limit

        System.out.println(">>> Applying a raise that exceeds the limit:");
        intern1.setSalary(19000);
        intern1.applyRaise(20); // 19000 + 20% = 22800 → capped at 20000

        System.out.println(">>> Creating intern with negative salary:");
        Intern intern3 = new Intern(
                203, "Tom", "Baker", "tom@company.com",
                "HR", -5000,
                "University of Augsburg", "HR Management", 4);
        System.out.println("Salary after creation: $" + intern3.getSalary());
    }
}