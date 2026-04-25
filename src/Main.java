//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {{
        // Creazione di un array per contenere 10 dipendenti
        Employ[] staff = new Employ[10];
        // Test di un dipendente normale
        Employ emp = new Employ("Mario", "001", "IT", 25000.0, 1);
        emp.login();
        System.out.println("Salario Mario: " + emp.getSalary());

        // Test dello stagista (Intern)
        Intern intern = new Intern("Luca", "002", "Marketing", 25000.0, 0);
        System.out.println("Salario Luca (dovrebbe essere 20000): " + intern.getSalary());


        // Inizializzazione dei 10 dipendenti
        staff[0] = new Employ("Mario Rossi", "E001", "IT", 35000.0, 3);
        staff[1] = new Employ("Luigi Verdi", "E002", "HR", 28000.0, 2);
        staff[2] = new Employ("Anna Bianchi", "E003", "Marketing", 32000.0, 3);
        staff[3] = new Employ("Giulia Neri", "E004", "IT", 45000.0, 5);
        staff[4] = new Employ("Paolo Gialli", "E005", "Finance", 38000.0, 4);
        staff[5] = new Employ("Elena Viola", "E006", "Sales", 26000.0, 1);
        staff[6] = new Employ("Marco Blu", "E007", "IT", 31000.0, 2);
        staff[7] = new Employ("Sofia Rosa", "E008", "HR", 29500.0, 2);
        staff[8] = new Employ("Luca Marrone", "E009", "Finance", 41000.0, 4);
        staff[9] = new Intern("Sara Arancio", "I010", "IT", 15000.0, 0); // Esempio con Intern

        // Ciclo per stampare le proprietà di tutti i 10 dipendenti
        System.out.println("--- ELENCO DIPENDENTI ---");
        for (int i = 0; i < staff.length; i++) {
            System.out.println("Dipendente #" + (i + 1));
            System.out.println("Nome: " + staff[i].name);
            System.out.println("ID: " + staff[i].idNumber);
            System.out.println("Reparto: " + staff[i].department);
            System.out.println("Stipendio: " + staff[i].getSalary() + "€");
            System.out.println("Livello: " + staff[i].getLevel());
            System.out.println("-------------------------");
        }
    }
    }
}