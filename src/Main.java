import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String delimitation = "===========================================================";
        System.out.println(delimitation);

        int[] numbers = {10, 5, 20, 25, 30, 40};
        System.out.println("The numbers of the array are: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("The numbers of the array are after sorting : " + Arrays.toString(numbers));

        int minValue = numbers[0];
        int maxValue = numbers[numbers.length - 1];
        int diffrence_Max_Min = maxValue - minValue;
        int secondMinValue = numbers[1];


        System.out.println("Maximum value is: " + maxValue);
        System.out.println("Minimum value is: " + minValue);
        System.out.println("The diffrence between Maximum and Minimum value is: " + diffrence_Max_Min);
        System.out.println("The second Minimum value is: " + secondMinValue);


        System.out.println(delimitation);
        System.out.println("");
        System.out.println("***The second method of resolving  task 1 and 2 ***");
        System.out.println("");
        System.out.println(delimitation);

        int[] numberOfArray = {30, 25, 50, 95, 10, 65, 85, 70};
        System.out.println("The numbers of the array are: " + Arrays.toString(numberOfArray));

        int max_Value = numberOfArray[0];
        int min_Value = numberOfArray[0];


        for (int i : numberOfArray)
            if (i > max_Value)
                max_Value = i;


        System.out.println("Max value of the array is : " + max_Value);


        for (int i : numberOfArray)
            if (i < min_Value)
                min_Value = i;


        System.out.println("Min value of the array is : " + min_Value);

        int diffrence_Max_Min2 = max_Value - min_Value;
        System.out.println("Diffrence of Max and Min of the array is : " + diffrence_Max_Min2);
        System.out.println(delimitation);

        int secondNumber = numberOfArray[0];

        for (int i : numberOfArray)
            if (i < secondNumber && i > min_Value)
                secondNumber = i;

        System.out.println("The second minimum value of the array is : " + secondNumber);
        System.out.println(delimitation);
        ArrayList<Employee> employeesOfTheCompany = new ArrayList<>();
        employeesOfTheCompany.add(new Employee("Max", 41, "Site Manager", 100_000));
        employeesOfTheCompany.add(new Employee("Enis", 48, "Operation Manager OutBound", 80_000));
        employeesOfTheCompany.add(new Employee("Simon", 33, "Operation Manager Inbound", 75_000));
        employeesOfTheCompany.add(new Employee("Aslyan", 26, "Manager IB", 45_000));
        employeesOfTheCompany.add(new Intern("Alex", 35, " FC Associate IB   ", 21_000));
        employeesOfTheCompany.add(new Intern("Ibrahim", 22, " FC Associate OB ", 19_000));
        employeesOfTheCompany.add(new Employee("Sam", 28, "Team Lead", 32_000));
        employeesOfTheCompany.add(new Intern("Taca", 31, " Ricever IB ", 22_000));
        employeesOfTheCompany.add(new Employee("Andy", 48, " Instructor IB", 25_000));
        employeesOfTheCompany.add(new Intern("Paul", 40, " Instructor OB ", 19_999));

        for (Employee employee : employeesOfTheCompany) {

            if (employee instanceof Intern) {

                System.out.println("\nPresentation" + "\nName: " + employee.getNameEmployee() + "\nAge: " + employee.getAge() + "\nPosition in the Company: " + employee.getPositionEmployee() + "\nSalary: €" + employee.getSalaryOfEmployee());
            }

            else {

                System.out.println("\nPresentation" + "\nName: " + employee.getNameEmployee() + "\nAge: " + employee.getAge() + "\nPosition in the Company: " + employee.getPositionEmployee() + "\nSalary: €" + employee.getSalaryOfEmployee());
            }




        }


    }
}




