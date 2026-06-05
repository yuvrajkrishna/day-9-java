import java.util.Arrays;
public class prac4 {
    public static void main (String args[]){
        String query = "Capgemini";
        String input [] = query.split("");
        String reversed = "";
        for(int i = input.length-1; i >= 0; i--){
            reversed += input[i];
        }
        System.out.println(reversed);
        // int start = 0 ; 
        // int end = input.length - 1 ;

        // while(start<end){
        //     String temp = input[start];
        //     input[start] = input[end];
        //     input[end] = temp;
        //     end--;
        //     start++;
        // }
        //     System.out.println(Arrays.toString(input));
        

    }
}
