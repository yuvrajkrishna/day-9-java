public class largestNum {
    public static int getLargest(int numbers[]){
        // int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i  < numbers.length ; i++){
            if(smallest > numbers[i]){
                // largest = numbers[i];
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main ( String args []){
        int numbers [ ] = {2,1,6,4,3};
        System.out.println("Smallest number is : "+ getLargest(numbers));
    }
}
