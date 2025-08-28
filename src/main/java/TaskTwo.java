//Write a method in Java to find the smallest and second smallest elements of a given array
// and print it in the console.
// Use loops and conditionals to develop the algorithm.

public class TaskTwo {
    public static void main(String[] args){
        int[] nums = {3};

        if(nums.length==2){
            int min1 = nums[0];
            int min2 = nums[1];

            if(nums[1]<nums[0]){
                min1 = nums[1];
                min2 = nums[0];
            }
            System.out.println("The smallest number: " + min1);
            System.out.println("The second smallest: " + min2);
        } else if(nums.length>2){
            int min1 = nums[0];
            int min2 = nums[1];

            for (int i = 2; i < nums.length; i++) {
                for (int j = 2; j < nums.length; j++) {
                    if(nums[i]<min1 && nums[i]< min2){
                        min2 = min1;
                        min1 = nums[i];
                    }else if(nums[i]>min1 && nums[i]< min2){
                        min2 = nums[i];
                    }
                }
            }
            System.out.println("The smallest number: " + min1);
            System.out.println("The second smallest: " + min2);
        }else{
            System.out.println("Inalid array length - must be 2 numbers minimum");
        }

    }
}
