public class main1 {
    public static void main(String[] args) {
        Intern i1 = new Intern(101, "Riya", "Intern - QA", 18000);
        i1.displayInfo();

        System.out.println("---- Trying to set salary above the cap ----");
        i1.setSalary(25000);  // will be capped to 20000
        i1.displayInfo();
    }
}

