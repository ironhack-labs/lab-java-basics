package Question3;

public class Intern extends Employee {
   public static final int MAX_SALARY = 20000;

    public Intern(String fullName, String position, int salary) {
        super(fullName, position, salary);
        if (salary > MAX_SALARY) {
            throw new IllegalArgumentException("Max salary for intern is " + MAX_SALARY);
        }
        }
    }
