package PackageExercise4;

public class Application {
    public static void main(String[] args) {


        Intern intern1 = new Intern("Hellie R", 39);
        intern1.updateInternSalary(12000);
        System.out.println(intern1);
        System.out.println(" ");
        Intern intern2 = new Intern("Boldie", 37);
        intern2.updateInternSalary(25000);
        System.out.println(intern2);

    }
}
