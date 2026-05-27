public class reversearray {
    public static void reverseanArray(int numbers[]){
        int start = 0 , last = numbers.length - 1;
        while(start<last){
            int temp = numbers[start];
            numbers[start] = numbers[last];
            numbers[last] = temp;
            start++;
            last--;
        }
    }
    public static void main (String args []){
        int numbers [] = {2,4,6,8,10};
        reverseanArray(numbers);
        for(int i = 0 ; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
