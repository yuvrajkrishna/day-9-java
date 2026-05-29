public class maxSubArray {
    public static void maxSubArray(int numbers [ ]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < numbers.length;i++){
            int start = i;
            for(int j = i ; j < numbers.length;j++){
                int end = j;
                int sum = 0;

                for(int k = start ; k <= end; k++){
                    sum+=numbers[k];
                    if(sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println("The max value is :" + max);
    }
    public static void main(String[] args) {
        int numbers [ ] = {1,-2,6,-1,3};
        maxSubArray(numbers);
    }
}
