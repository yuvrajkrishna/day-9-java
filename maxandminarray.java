public class maxandminarray {
    public static void  mandminarray(int numbers []){
        int sum = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <numbers.length; i++){
                int start = i;
            for(int j = i; j<numbers.length;j++){
                int end = j;
                int value = 0;
                for(int k = start; k <= end;k++){
                    value += numbers[k];
                    if(value < min){
                        min = value;
                    }
                    if(value > sum){
                        sum = value;
                    }
                }
            }
        }
        System.out.println(sum);
        System.out.println(min);
    }
    public static void main(String[] args) {
        int numbers[] = {2,-4,-6,8};
        mandminarray(numbers);
    }
}
