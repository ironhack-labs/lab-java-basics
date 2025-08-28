//Write a method in Java to get the difference between the largest and smallest values
//in an array of integers. The length of the array must be 1 and above.
//Use loops and conditionals to develop the algorithm.

public class TaskOne {
    public static void main(String[] args){
        int[] nums = {5, 7, 8};

        if(nums.length<1){
            System.out.println("Invalid array length");
        }else{
            int largest = nums[0];
            for(int num : nums){
                if(num>largest){
                    largest=num;
                }
            }

            int smallest = largest;
            for(int num : nums){
                if(num<smallest){
                    smallest=num;
                }
            }

            System.out.println("Amplitude between largest and smallest number is: " + (largest - smallest));
        }
    }
}
