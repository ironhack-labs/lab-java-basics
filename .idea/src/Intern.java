class Intern extends Employee {
    public static final double MAX_SALARY = 20000;

    public Intern(String name, int id, double salary) {
        super(name, id, validateSalary(salary));
    }

    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Salario excede el máximo permitido para interns. Ajustando a " + MAX_SALARY);
            return MAX_SALARY;
        }
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(validateSalary(salary));
    }
}