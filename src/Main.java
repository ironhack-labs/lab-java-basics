import java.util.Scanner;

public class Main {
    //create scanner out of classes
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //My Array group
        Class2 arr1 = new Class2("01","Adam","Pain",30000);
        Class2 arr2 = new Class2("02","Eve","Joice",25000);
        Class2 arr3 = new Class2("03","Cane","Pain",18500);
        //include Class1
        Class1 arrCopy = new Class1("asd");
        //group all the array toghether
        arrCopy.addClass(arr1);
        arrCopy.addClass(arr2);
        arrCopy.addClass(arr3);
        //print my header (just for fun!)
        Header link = new Header();
        link.header();
        //print my table
        System.out.println("- reference table -");
        arrCopy.printWaglio();
        //for later use in the while
        boolean quit = false;
        int choice = 0;
        //the loop + switch options
        while(!quit) {
            System.out.println("Press 0 - to print options");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    solutionOne();
                    break;
                case 2:
                    solutionTwo();
                    break;
                case 3:
                    solutionThree();
                    break;
                case 4:
                    solutionFour();
                    break;
                case 5:
                    solutionFive();
                    break;
            }
        }//end while
    }//end of main class

    //main menu class
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("0 - to print options");
        System.out.println("1 - get the difference between the highest and smallest salary values in the table");
        System.out.println("2 - get the smallest and second smallest salary of the table");
        System.out.println("3 - Create an Employee class to represent an employee of a company.\n" +
                "Add the properties and include a salary.");
        System.out.println("4 - Create a class that extends from Employee.\n" +
                "All the Interns have a salary limit of 20000 (constant).\n" +
                "You must validate if an intern is created (or salary updated)\n" +
                "with a bigger salary than the max. The max value is set.");
        System.out.println("5 - Table with 10 Employees and properties.");
    }
    public static void solutionOne(){
        //My Array group
        Class2 arr1 = new Class2("01","Adam","Pain",30000);
        Class2 arr2 = new Class2("02","Eve","Joice",25000);
        Class2 arr3 = new Class2("03","Cane","Pain",18500);
        //include Class1
        Class1 arrCopy = new Class1("asd");
        //group all the array toghether
        arrCopy.addClass(arr1);
        arrCopy.addClass(arr2);
        arrCopy.addClass(arr3);
        //--------------------
        //my function
        int [] arr = {arr1.getSalary(),arr2.getSalary(),arr3.getSalary()};
        int highestValue = arr[0];
        int smallestValue = arr[0];
        //find the highest value
        for (int value : arr) {
            //find the highest value
            if (value > highestValue) {
                highestValue = value;
            }
            //find the smallest value
            else if (value < smallestValue) {
                smallestValue = value;
            }
        }
        System.out.println("The difference between the largest and smallest values is : " + (highestValue - smallestValue));
    }//end function 1
    public static void solutionTwo(){
        //My Array group
        Class2 arr1 = new Class2("01","Adam","Pain",30000);
        Class2 arr2 = new Class2("02","Eve","Joice",25000);
        Class2 arr3 = new Class2("03","Cane","Pain",18500);
        //include Class1
        Class1 arrCopy = new Class1("asd");
        //group all the array toghether
        arrCopy.addClass(arr1);
        arrCopy.addClass(arr2);
        arrCopy.addClass(arr3);
        //--------------------
        //show the smallest value
        int [] arr = {arr1.getSalary(),arr2.getSalary(),arr3.getSalary()};
        int smallestValue1 = arr[0];
        int temp;
        int size;
        size = arr.length;
        for (int value : arr){
            if (value < smallestValue1){
                smallestValue1 = value;
            }
        //show the second smallest Value
            for (int i=0; i<size; i++){
                for(int j=1+1; i<size; i++){
                    if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
    System.out.println("show the smallest Value : "+smallestValue1);
    System.out.println("show the second smallest Value : "+arr[size-2]);
    }
    public static void solutionThree(){
        //My Employee
        Class2 arr1 = new Class2("01","Adam","Pain",30000);
        //include Class1
        Class1 arrCopy = new Class1("asd");
        //group all the array toghether
        arrCopy.addClass(arr1);
        //--------------------
        arrCopy.printWaglio();
    }
    public static void solutionFour(){
        Class2 arr1 = new Class2("01","Adam","Pain",30000);
        Class2 arr2 = new Class2("02","Eve","Joice",25000);
        Class2 arr3 = new Class2("03","Cane","Pain",18500);
        //include Class1
        Class1 arrCopy = new Class1("asd");
        //group all the array toghether
        arrCopy.addClass(arr1);
        arrCopy.addClass(arr2);
        arrCopy.addClass(arr3);
        //--------------------
        //System.out.println("The max salary is : 20000");
        //my function
        int maxLone = 20000;
        int [] arr = {arr1.getSalary(),arr2.getSalary(),arr3.getSalary()};
          for( int i=0; i < arr.length; i++ ){
              //System.out.println(arr[i]);
              if (arr[i] > maxLone){
                  System.out.println(arr[i]+ " : the salary exceeds the allowed ammount");
              }else {System.out.println(arr[i]+ " : the salary ammount is allowed");}
          }

    }
    public static void solutionFive(){
        //My Array group
        Class2 arr1 = new Class2("01","Adam","Pain",30000);
        Class2 arr2 = new Class2("02","Eve","Joice",25000);
        Class2 arr3 = new Class2("03","Cane","Pain",185000);
        Class2 arr4 = new Class2("04","Abel","Pain",186000);
        Class2 arr5 = new Class2("05","Cesare","L'Imperatore",204500);
        Class2 arr6 = new Class2("06","Antonio","Il Buono",20000);
        Class2 arr7 = new Class2("07","Bruto","Il Congiurato",21500);
        Class2 arr8 = new Class2("08","Caligola","Il Folle",21600);
        Class2 arr9 = new Class2("09","Annibale","Il Barbaro",18005);
        Class2 arr10 = new Class2("10","Scipione","L'africano",20100);
        //include Class1
        Class1 arrCopy = new Class1("asd");
        //group all the array toghether
        arrCopy.addClass(arr1);
        arrCopy.addClass(arr2);
        arrCopy.addClass(arr3);
        arrCopy.addClass(arr4);
        arrCopy.addClass(arr5);
        arrCopy.addClass(arr6);
        arrCopy.addClass(arr7);
        arrCopy.addClass(arr8);
        arrCopy.addClass(arr9);
        arrCopy.addClass(arr10);
        //--------------------
        //my function
        arrCopy.printWaglio();
    }
}