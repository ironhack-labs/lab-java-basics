package lab.exercise3;

public class Main {
    public static void main (String [] args ){

        Employee e1 = new Employee("Roberto",35,35100,true,'L');
        Employee e2 = new Employee( "Lisbeth", 42, 24000, false, 'E');
        Employee e3 = new Employee( "Pedro", 45, 31000, true, 'E');
        Employee e4 = new Employee("Carlos",36,35100,true,'L');
        Employee e5 = new Employee( "Anna", 43, 24000, false, 'E');
        Employee e6 = new Employee( "Juan", 48, 31000, true, 'E');
        Employee e7 = new Employee("Cristina",33,35100,true,'L');
        Employee e8 = new Employee( "Santi", 37, 24000, false, 'E');
        Employee e9 = new Employee( "Laura", 49, 31000, true, 'E');
        Employee e10 = new Employee("Fred",35,35100,true,'L');



        // uso el Get para ver los datos y el Set para modificar
        System.out.println(e1.getName() + " - Salary After:" + e1.getSalary());
        e1.setSalary(45100);
        System.out.println(e1.getName() + " -  Before:" + e1.getSalary());
        System.out.println();

        System.out.println(e2.getName() + " - Salary After:" + e2.getSalary());
        e2.setSalary(30000);
        System.out.println(e2.getName() + " - Before:" + e2.getSalary());
        System.out.println();

        System.out.println(e9.getName() + " - Salary After:" + e9.getSalary());
        e9.setSalary(21000);
        System.out.println(e9.getName() + " - Before:" + e9.getSalary());
        System.out.println();

        //Hemos creado Intern y heredado de Employee
        Intern intern1 = new Intern("Sandra", 39, 50000, true, 'L');
        Intern intern2 = new Intern("Marcos", 28, 20000, false,'E');
        Intern intern3 = new Intern("Lucas", 50, 10000, true, 'L');

        System.out.println(intern1.getName()+ " - Salary : "+ intern1.getSalary());
        System.out.println(intern2.getName()+ " - Salary : "+ intern2.getSalary());
        System.out.println(intern3.getName()+ " - Salary : "+ intern3.getSalary());

        System.out.println();
        System.out.println(e5);
        System.out.println(e2);
        System.out.println(intern1);


    }

}

