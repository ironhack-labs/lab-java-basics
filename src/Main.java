import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Laura", 25, 30000, "Manager"));
        employees.add(new Employee("Maria", 29, 31000, "HR"));
        employees.add(new Employee("Dani", 33, 28000, "Developer"));
        employees.add(new Employee("Ivan", 36, 31000, "Designer"));
        employees.add(new Employee("Fofo", 33, 35000, "Team Lead"));

        employees.add(new Intern("Paco", 57, 18000, "Intern"));
        employees.add(new Intern("Juanca", 27, 22000, "Intern"));
        employees.add(new Intern("Edu", 34, 17000, "Intern"));
        employees.add(new Intern("Raul", 30, 16000, "Intern"));
        employees.add(new Intern("Alex", 30, 15000, "Intern"));

        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).printInfo();
        }
        
        int[] numbers = {12, 5, 8, 21, 3};

        System.out.println("Difference: " + getMaxMinDifference(numbers));
        findTwoSmallest(numbers);
    }

    public static int getMaxMinDifference(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        return max - min;
    }

    public static void findTwoSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}