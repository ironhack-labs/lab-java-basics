package lab.exercise2;

public class Exercise2 {
    public static void main (String[] args){

        int[] numbers = {3, 5, 8, 9, 1};
        int min = numbers[0];
        int secondMin = numbers[0];

        //Creamos el array de numeros
        for (int i = 0; i < numbers.length; i++) {
            //Recorremos con un bucle
            if (numbers[i] <= min){
                secondMin = min;
                min = numbers[i];
            }
            else if (numbers[i] < secondMin && numbers[i] != min ){
            secondMin = numbers[i];
            }
        }// Concatenamos
        System.out.println("Minimum :" + min);
        System.out.println("Second Minimum : " + secondMin);
    }
}