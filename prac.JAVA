import java.util.Arrays;
public class prac{
    public static void main(String args[]){
        String q = "#yu#vr#aj";
        String [] ans = q.split("");
        System.out.println(Arrays.toString(ans));
        String  finalarr = "" ;
        int count = 0;
        String hash ="";
        String finalans ;
        for(int i  = 0; i<ans.length;i++){
            // System.out.println(ans[i]);
            if(!ans[i].equals("#")){
               finalarr += ans[i];
            }

            else{
                count++;
            }
           
                
            
        }
        System.out.println(count);
        for(int i = 0; i<count;i++){
            hash+="#";
        }
        System.out.println(hash);
        System.out.println(finalarr);
        finalans = hash + finalarr;
        System.out.println(finalans);
    }
}