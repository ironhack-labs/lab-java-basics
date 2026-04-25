public class Intern extends Employ{
    // Costante per il limite massimo di stipendio
    private static final double MAX_SALARY = 20000.0;

    // Costruttore
    public Intern(String name, String idNumber, String department, double salary, int level) {
        super(name, idNumber, department, 0, level);
        // Usiamo il setter validato per impostare lo stipendio iniziale
        this.setSalary(salary);
    }

    // Override del setter per validare il limite salariale
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Attenzione: Stipendio non valido per un Intern. Impostato al massimo consentito: " + MAX_SALARY);
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
}