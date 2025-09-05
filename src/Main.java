import Question3.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mark", "Manager", 3000);

        emp1.displayInfo();
        emp1.giveRaise(10);
        System.out.println("-----");
        System.out.println(emp1 + " After raise: ");
        emp1.displayInfo();
        emp1.promote("Senior Manager");
        emp1.setSalary(5000);
        System.out.println("After promote: ");
        emp1.displayInfo();
        System.out.println("-----");

        System.out.println("Interns: ");
        Intern int2 = new Intern(" David", "Intern", 2000);
        int2.displayInfo();

        Intern int3 = new Intern(" Tom", " Intern" , 2000);
        int3.displayInfo();
        System.out.println("-----");

        System.out.println("Company hired next interns:");
        Intern[] interns = new Intern[10];
        interns[0] = new Intern("Liam" ,"Intern" , 2000);
        interns[1] =new Intern("Pam" ,"Intern" , 2000);
        interns[2] = new Intern("Nina" ,"Intern" , 2000);
        interns[3] = new Intern("Alex" ,"Intern" , 2000);
        interns[4] = new Intern("Luka" ,"Intern" , 2000);
        interns[5] = new Intern("Manuel" ,"Intern" , 2000);
        interns[6] = new Intern("Lara", "Intern" , 2000);
        interns[7] = new Intern("Tony", "Intern" , 2000);
        interns[8] = new Intern("Sara", "Intern" , 2000);
        interns[9] = new Intern("Daniel", "Intern", 2000);
      for (Employee compintern : interns){
          compintern.displayInfo();
      }
    }


}