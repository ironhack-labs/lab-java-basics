public class Intern extends Employee {
    // Definimos el límite como una constante estática y final
    private static final double MAX_SALARY_LIMIT = 20000.0;

    public Intern(String name, String id, double salary) {
        // Usamos super() para llamar al constructor de Employee
        // Si el salario es mayor al límite, lo bajamos automáticamente a 20000
        super(name, id, salary > MAX_SALARY_LIMIT ? MAX_SALARY_LIMIT : salary);
    }

    @Override
    public void setSalary(double salary) {
        // Volvemos a validar por si intentan cambiar el salario después de creado
        if (salary > MAX_SALARY_LIMIT) {
            super.setSalary(MAX_SALARY_LIMIT);
        } else {
            super.setSalary(salary);
        }
    }
}