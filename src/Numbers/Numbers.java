package Numbers;

public class Numbers {
    public static void main(String[] args) {
        int[] arr = {5, 17, 3, 24, 71};

        int difference = getDifference(arr);

        System.out.println("Difference between highest and lowest number is " + difference);
        findSmallestandSecondsmallest(arr);
    }

    public static int getDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int num: arr){
            if (num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return max - min;
    }



    public static void findSmallestandSecondsmallest (int[] arr){
        int smallest = arr[0];
        int secondsmallest = arr[0];
        for (int num : arr){
            if (num < smallest) {
                secondsmallest = smallest;
                smallest = num;
            }else if(num < secondsmallest && num != smallest) {
                secondsmallest = num ;
            }

            }



        System.out.println("Smallest : " +smallest+ " Second Smallest:  " + secondsmallest);
    }
    }







