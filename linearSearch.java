public class linearSearch{
    public static int linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20, 40 ,50 ,60 ,4};
        int key = 4;
        int index = linearSearch(numbers, key);
        System.out.println("the index of key is : "+ index);
    }
}