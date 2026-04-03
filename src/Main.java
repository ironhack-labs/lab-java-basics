import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creamos Array!
        int[] misNumeros = {5, 2, 4, 6, 9, 10};

        int resultado = getDifference(misNumeros);
        System.out.println("La diferencia es: " + resultado);
        findTwoSmallest(misNumeros);

        //ArrayList de empleados
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "JuanDeDios", 18, 500));
        employees.add(new Employee(2, "Pedro", 20, 10000));
        employees.add(new Employee(3, "Maria", 32, 15000));
        employees.add(new Employee(4, "Antonio", 45, 19000));
        employees.add(new Employee(5, "Palomino", 62, 17000));
        employees.add(new Employee(6, "Paulina", 34, 13000));
        employees.add(new Employee(7, "Paulino", 38, 20000));
        employees.add(new Employee(8, "Adolfo", 40, 11000));
        employees.add(new Intern  (9, "Manuel", 39, 25000));
        employees.add(new Employee(10, "Francisco", 24, 17500));

        System.out.println("Lista de empleados");

        //Bucle para cada empleado
        for(Employee emp: employees){
            System.out.println(emp);
        }

    }

    //Creación Metod1
    public static int getDifference(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        //Bucle para recorrer array de números
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max - min;
    }

    //Metod2
    public static void findTwoSmallest(int[] numbers) {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = numbers[i];
            } else if (numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }

        }
        System.out.println("El más pequeño es " + firstSmallest);
        System.out.println("----------------");
        System.out.println("El segundo más pequeño es " + secondSmallest);
    }



}
