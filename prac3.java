public class prac3 {
    public static void main (String args []){
        int arr [] = {1,2,3,3,4,1,4,5,1,2};
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
    
                
            }
            
            System.out.println(count);
            count=1;
        }
    }
}
