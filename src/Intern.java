public class Intern extends Employee {

        public static final double MAX_SALARY = 20000;

        public Intern(String name, int age, double salary, String position) {
            super(name, age, salary, position);

            if (salary > MAX_SALARY) {
                System.out.println("Salary too high, adjusted to max");
                setSalary(MAX_SALARY);
            }
        }

        @Override
        public void setSalary(double salary) {
            if (salary > MAX_SALARY) {
                System.out.println("Can not exceed max salary");
            } else {
                super.setSalary(salary);
            }
        }
    }
