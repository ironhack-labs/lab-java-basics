int[] twoSmallest(int[] numbers) {
    int[] result = {numbers[0], numbers[0]};

    for(int number : numbers){
        if(number < result[0]){
            result[1] = result[0];
            result[0] = number;
        } else if (number < result[1] && number!= result[0]){
            result[1] = number;
        }
    }

    return result;
}


void main() {
    int[] numbers = {13, 6, 33, 44, 18, -24};
    int[] result = twoSmallest(numbers);
    System.out.println("Smallest is " + result[0] + " and second smallest is " + result[1]);
}