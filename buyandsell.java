import java.util.*;
public class buyandsell {
    public static void buyandsell(int price[]){
        // calculate buying
        int buy[] = new int[price.length];
        buy[0] = price[0];
        for(int i = 1 ; i<price.length;i++){
            buy[i] = Math.min(price[i],buy[i-1]);
        }
        int MaxProfit = 0 ;
        for(int i = 1; i <price.length;i++ ){
            int profit = price[i] - buy[i-1];
            if(MaxProfit < profit){
                MaxProfit = profit;
            }
        }
        System.out.println(MaxProfit);
    }
     public static void main(String[] args) {
        int price [] = {7,1,5,3,6,4};
        buyandsell(price);
     }
}