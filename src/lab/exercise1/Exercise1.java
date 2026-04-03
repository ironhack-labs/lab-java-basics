package lab.exercise1;

public class Exercise1 {
    public static void main (String [] args){

        //Creamos el array de Lista de Numeros
        int[] listNumbers = { 3, 6, 9, 13, 21 };
        int max = listNumbers[0];
        int min = listNumbers[0];

        //Recorremos la lista de numeros, if (comparar y actualizar)
        for (int i = 0; i < listNumbers.length; i++) {
            if (listNumbers[i] > max){
                max = listNumbers[i]; //Valor Maximo
            }
            if (listNumbers[i] < min){
                min = listNumbers[i]; //Valor Minimo
            }
        }
        int total = max - min;
        System.out.println(total);

    }
}