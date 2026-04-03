public class Exercises {

    //Ejercicio1: Metodo para calcular diferencia min max

    public static int diferenceMinMax(int[] numbers){
     //Declarando variables para almacenar el min y max
        int max = numbers[0];
        int min = numbers[0];
        //Bucle for
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return  max - min;
    }

    //Ejercicio 2: Metodo para calcular el 1er y 2do numero menor
    public static void FindSmallSeconsSmall(int [] numbers){
        //variables iniciadas en el máximo posible
        int min = Integer.MAX_VALUE;
        int seconMin = Integer.MAX_VALUE;

        //Lop para interar y saber el menor y segundo m.
        for(int num : numbers){
            if(num < min){
                seconMin = min;
                min = num;
            } else if (num < seconMin && num != min) {
                seconMin = num;

            }
        }
        System.out.println("The smallest num is: " + min +  " and the second smallest is : " + seconMin);
    }
}
