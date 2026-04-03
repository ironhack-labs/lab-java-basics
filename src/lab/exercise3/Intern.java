package lab.exercise3;

public class Intern extends Employee {
    public static final double MAX_SALARY = 20000;

    public Intern(String name, int age, double salary, boolean isFullTime, char shift){
        super(name, age, salary> MAX_SALARY ? MAX_SALARY : salary, isFullTime, shift);
    }

    //Esto aun me confunde!!! (necesitas practicar)
    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            super.setSalary(MAX_SALARY);
            return;
        }
        super.setSalary(salary);
    }

    // Ahora un @override toString llamando a SUPER para usar los atributos del padre (Employee)
    @Override
    public String toString() {
        return "Intern --> " + super.toString();
    }
}

