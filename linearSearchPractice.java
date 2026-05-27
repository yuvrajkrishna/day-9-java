import java.util.*;

class linearSearchPractice{

    public static int foods(String food[],String key){
        for(int i = 0 ; i <food.length;i++){
            if(food[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args []){
        String food [] = {"dosa","samosa","paratha","pizza"};
        String key = "pizza";
        int index = foods(food,key);
        System.out.println("The food is at the index : " + index);
    }
}