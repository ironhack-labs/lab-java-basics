public class difflargesmall {
    public static void main(String[] args) {
        int[] numbers ={100,200,34,234,123,342};
        
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        
        int diff =max-min;

        System.out.println("difference between the largest and smallest values:"+diff);
        
        
    }
    
}
