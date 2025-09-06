public class TestTrainee {
    public static void main(String[] args) {

        Trainee t1 = new Trainee("David", "Intern", 50000);


        Trainee t2 = new Trainee("Eva", "Intern", 18000);


        System.out.println(t1);
        System.out.println(t2);


        t2.setSalary(35000);
        System.out.println("After salary refresh: " + t2);
    }
}
