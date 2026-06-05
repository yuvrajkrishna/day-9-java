public class maxSubArrayKadane { 
     public static void maxSubArrayKadane(int numbers[]){
        int csum = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0 ; i < numbers.length ; i++){
            csum += numbers[i];

            if(csum > ms){
                ms = csum;
            }

            if(csum < 0){
                csum = 0;
            }
            
            }
            System.out.println(ms);
        }
    
    
     
     public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubArrayKadane(numbers);
     }
}
