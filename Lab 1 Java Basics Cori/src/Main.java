//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Exercise 1
        // Write a method in Java to get the difference
        // between the largest and smallest values in an array of integers.
        // The length of the array must be 1 and above.
        // Use loops and conditionals to develop the algorithm.


        int[] differenceLS = {10, 30, 5, 7, 6, 80, 900, 175, 250, 20};

        int maxNum = differenceLS[0];
        int minNum = differenceLS[0];

        for(int i = 0; i < differenceLS.length; i++){
            if (maxNum < differenceLS[i]){
                maxNum = differenceLS[i];
            }else if(minNum > differenceLS[i] ){
                minNum = differenceLS[i];
            }
        }

        int difference = maxNum - minNum;

        System.out.println("The difference between the largest and smallest values is max " + difference + ".");

        // Exercise 2
        // Write a method in Java to find the smallest and the second smallest elements
        // of a given array and print it in the console.
        // Use loops and conditionals to develop the algorithm.

        int[] smallestAndSecondSmallest = {510, 200, 400, 500, 350, 150, 680, 251, 925};

        int smallestNum = smallestAndSecondSmallest[0];
        int secondSmallestNum = smallestAndSecondSmallest[0];

        for(int i = 0; i < smallestAndSecondSmallest.length; i++){
            if (smallestNum > smallestAndSecondSmallest[i]){
                secondSmallestNum = smallestNum;
                smallestNum = smallestAndSecondSmallest[i];
            } else if(secondSmallestNum > smallestAndSecondSmallest[i] && smallestNum != smallestAndSecondSmallest[i]) {
                    secondSmallestNum = smallestAndSecondSmallest[i];
            }
        }

        System.out.println("The smallest number is " + smallestNum + " and the second smallest is " + secondSmallestNum + ".");




        // Exercise 3 in Employee.java
        // Exercise 4 in Intern.java

        //Exercise 5
        // Write a program that creates 10 Employees and print it al the properties.

        Employee employee1 = new Employee("Marcus", "Kornelius", 29, "Data Analyst", 3, 28000, true);
        Employee employee2 = new Employee("Maria", "BonDia", 32, "Accountant", 4, 36000, true);
        Employee employee3 = new Employee("Joana", "Triana", 33, "Software Developer", 5, 45000, true);
        Employee employee4 = new Employee("Clara", "Aldana", 25, "Project Manager", 4, 36000, true);
        Employee employee5 = new Employee("Laia", "Mana", 40, "HR", 3, 28000, true);
        Employee employee6 = new Employee("Kostas", "Lipon", 42, "Customer Support", 2, 24000, true);
        Employee employee7 = new Employee("Carme", "Ganga", 22, "Business Analyst", 3, 28000, true);
        Employee employee8 = new Employee("Ona", "Vento", 35, "Marketing Specialist", 2, 24000, true);
        Employee employee9 = new Employee("Niko", "Panallet", 52, "Operations Manager", 4, 36000, true);
        Employee employee10 = new Employee("Petro", "Metrio", 38, "Sales Representative", 2, 24000, true);


        System.out.println(employee1.getEmployeeDetails());
        System.out.println(employee2.getEmployeeDetails());
        System.out.println(employee3.getEmployeeDetails());
        System.out.println(employee4.getEmployeeDetails());
        System.out.println(employee5.getEmployeeDetails());
        System.out.println(employee6.getEmployeeDetails());
        System.out.println(employee7.getEmployeeDetails());
        System.out.println(employee8.getEmployeeDetails());
        System.out.println(employee9.getEmployeeDetails());
        System.out.println(employee10.getEmployeeDetails());


        // Extra

        // Intern intern1 = new Intern("Blanca", "Valeria");

        // intern1.setSalary(30000);
        // employee1.offEmployee();
        // System.out.println(employee1.getEmployeeDetails());


    }
}