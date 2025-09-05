package Question3;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mark Bright", " Manager", 3000);
        System.out.println("1. Employee: ");
        emp1.displayInfo();
        emp1.giveRaise(10);
        System.out.println("-----");
        System.out.println("Mark Bright got raise.");
        System.out.println("After raise: ");
        emp1.displayInfo();
        emp1.promote("Senior Manager");
        emp1.setSalary(5000);
        System.out.println("After promote: ");
        emp1.displayInfo();
        System.out.println("-----");

        System.out.println("Interns: ");
        Intern int2 = new Intern(" David Motes", "Intern", 2000);
        int2.displayInfo();

        Intern int3 = new Intern(" Tom Pacy", " Intern" , 2000);
        int3.displayInfo();
        System.out.println("-----");

        System.out.println("Company hired next interns:");
        Intern[] interns = new Intern[10];
        interns[0] = new Intern("Liam Miller" ,"Intern" , 2000);
        interns[1] =new Intern("Pam Paulson" ,"Intern" , 2000);
        interns[2] = new Intern("Nina Dominguez" ,"Intern" , 2000);
        interns[3] = new Intern("Alex Koreny" ,"Intern" , 2000);
        interns[4] = new Intern("Luka Littler" ,"Intern" , 2000);
        interns[5] = new Intern("Manuel Garcia" ,"Intern" , 2000);
        interns[6] = new Intern("Lara Butler", "Intern" , 2000);
        interns[7] = new Intern("Tony Park", "Intern" , 2000);
        interns[8] = new Intern("Sara Hawknins", "Intern" , 2000);
        interns[9] = new Intern("Daniel Clark", "Intern", 2000);
      for (Employee compintern : interns){
          compintern.displayInfo();
      }
    }


}