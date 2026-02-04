public class largestArray {
    public static int largestarray(int number[]){
        int largest = 0;
        for(int i=0;i<number.length;i++){
            if(number[i] > largest){
                largest = number[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args){
        int number[] = {1,2,6,3,4};
        System.out.println("The largest number is : "+ largestarray(number));
    }
}
