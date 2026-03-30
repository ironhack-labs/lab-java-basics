public class Intern extends Employee {
    // Límite constante de salario
    public static final double MAX_SALARY = 20000;

    public Intern(String name, String department, double salary) {
        // Llamamos al constructor del padre pero validamos el salario antes
        super(name, department, validateSalary(salary));
    }

    // Método estático auxiliar para validar en el constructor
    private static double validateSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Alerta: El salario excede el límite. Se ajustará al máximo permitido (" + MAX_SALARY + ").");
            return MAX_SALARY;
        }
        return salary;
    }

    // Sobrescribimos el setter para proteger actualizaciones futuras
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Alerta de actualización: No se puede asignar " + salary + ". Se asignará " + MAX_SALARY + ".");
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return "Intern [Name=" + getName() + ", Dept=" + getDepartment() + ", Salary=" + getSalary() + "]";
    }
}