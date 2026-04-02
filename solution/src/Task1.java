int range(int[] numbers) {
    int highestNumber = numbers[0];
    int lowestNumber = numbers[0];
    for (int number : numbers){
        if(number > highestNumber){
            highestNumber = number;
        }
        if(number < lowestNumber){
            lowestNumber = number;
        }
    }
    return highestNumber - lowestNumber;

}

void main() {
    int[] numbers = {4, 2, 2, 12, 9, 3};

    System.out.println("The range is " + range(numbers));
}