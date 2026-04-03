import java.util.ArrayList;

public class EmployeesApp {
    public static void main (String[] args) {
        System.out.println("Lab1_Ironhack");

       /* ==================EXERCISE #1=================== */

        //Declarando el array de numeros
        int[] numbers = {2, 5, 12, 24, 81};

        //Ejercicio 1: Obteniendo la diferencia
        int result = Exercises.diferenceMinMax(numbers);
        System.out.println("The diference betwen the max and min is: " + result);

        //Ejercicio 2: Saber el primer y segundo num. más pequeño
        Exercises.FindSmallSeconsSmall(numbers);

        //Pruebas

        Intern intern1 = new Intern("Ana", 22, "female", 18000, "EI0123");
        Intern intern2 = new Intern("Max", 22, "male", 24000, "EI0113");

        System.out.println("============== INTERNS CREATED ==============");
        System.out.println(intern1);
        System.out.println(intern2);

        intern1.setSalary(19000);
        intern2.setSalary(30000);

        System.out.println("============== INTERNS UPDATED ==============");
        System.out.println(intern1);
        System.out.println(intern2);

        System.out.println("intern1 updated salary: " + intern1.getSalary());
        System.out.println("intern2 updated salary: " + intern2.getSalary());

        //Ejercicio 5: App que lista empleados
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Marc", 24, "male", 23000, "EI124"));
        employees.add(new Employee("Ana", 32, "female", 28000, "EI111"));
        employees.add(new Employee("David", 43, "male", 30000, "EI456"));
        employees.add(new Employee("Jonny", 21, "male", 20001, "EI213"));
        employees.add(new Employee("Diana", 30, "female", 29000, "EI101"));
        employees.add(new Employee("Mariona", 56, "female", 33000, "EI983"));
        employees.add(new Employee("Luis", 42, "male", 34000, "EI233"));
        employees.add(new Employee("Marcos", 36, "male", 31020, "EI244"));
        employees.add(new Employee("Uriol", 31, "male", 30800, "EI412"));
        employees.add(new Employee("Hanna", 44, "female", 33000, "EI164"));

        System.out.println("============== EMPLOYEE LIST ==============");
        for(Employee emp : employees){
            System.out.println(emp);
        }
        }

    }

