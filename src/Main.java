public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int biggest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number > biggest) {
                biggest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        int result = biggest - smallest;
        System.out.println("Difference between biggest and smallest: " + result);

        int secondSmallest = biggest;

        for (int number : numbers) {
            if (number > smallest && number < secondSmallest) {
                secondSmallest = number;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Mina", 32, "Project Manager", 52000);
        employees[1] = new Employee("Jonas", 27, "Backend Developer", 46000);
        employees[2] = new Employee("Sara", 29, "UX Designer", 43000);
        employees[3] = new Employee("Leo", 24, "Customer Support", 31000);
        employees[4] = new Employee("Nina", 38, "Team Lead", 61000);
        employees[5] = new Employee("Tom", 34, "Data Analyst", 48000);
        employees[6] = new Employee("Elena", 26, "Marketing Assistant", 35000);
        employees[7] = new Intern("Yuna", 22, "Software Intern", 18000);
        employees[8] = new Intern("Marco", 23, "Business Intern", 25000);
        employees[9] = new Employee("David", 41, "Account Manager", 54000);

        System.out.println("Employee list:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}