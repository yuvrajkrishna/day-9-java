import java.util.Arrays;

public class prac2 {
    public static void main(String[] args) {
        String ans = "abbccc";
        String arr [] = ans.split("");
        String result = "";
        // System.out.println(Arrays.toString(arr));
        int count = 1;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    System.out.println(count);
                }
                
            }
            if(result.contains(arr[i])){
                  continue;  
                }
            else{
                result+=arr[i];
                if(count > 1){
                    result+=count;
                }
            count = 1;
            }
            
        }
        System.out.println(result);
       

    }
}
