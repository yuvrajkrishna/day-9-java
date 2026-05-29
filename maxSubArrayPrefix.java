public class maxSubArrayPrefix {
    public static void maxSubArrayPrefix(int numbers []){
        int currSum = 0 ;
        int maxsum = Integer.MIN_VALUE;
        int prefix []= new int[numbers.length];
        prefix[0]= numbers[0];

        for(int i = 1; i < numbers.length;i++){
            prefix[i] = prefix[i-1]+numbers[i];
            
        }
        System.out.println();
        for(int i = 0 ; i < numbers.length;i++){
            int start = i;
            for(int j = i; j < numbers.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currSum){
                    maxsum = currSum;
                }
            }
        }
        System.out.println("the max is :" + maxsum);
    }
    public static void main(String[] args) {
        int numbers [ ] = {1,-2,6,-1,3};
        maxSubArrayPrefix(numbers);
    }
}
