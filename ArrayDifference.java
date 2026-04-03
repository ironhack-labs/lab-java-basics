public class ArrayDifference {

    public static int getDifference(int[] arr) {
        
        int largest = arr[0];
        int smallest = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 7, 1, 9, 4};
        int[] arr2 = {-5, -1, -8, -3};
        int[] arr3 = {42};                  
        int[] arr4 = {0, 100, -50, 75};

        System.out.println(getDifference(arr1)); // 9 - 1 = 8
        System.out.println(getDifference(arr2)); // -1 - (-8) = 7
        System.out.println(getDifference(arr3)); // 42 - 42 = 0
        System.out.println(getDifference(arr4)); // 100 - (-50) = 150
    }
}