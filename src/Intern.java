public class Intern extends Employee {
    // Constante: el límite de salario para pasantes
    private static final double MAX_SALARY = 20000;

    public Intern(String name, double salary) {
        // Validamos en el constructor usando una función privada
        super(name, validateSalary(salary));
    }

    @Override
    public void setSalary(double salary) {
        // Validamos también al intentar actualizar el salario
        super.setSalary(validateSalary(salary));
    }

    private static double validateSalary(double salary) {
        return Math.min(salary, MAX_SALARY);
    }

    @Override
    public String toString() {
        return "Intern (Max 20k){name='" + getName() + "', salary=" + getSalary() + "}";
    }
}