public class sortArray {

    public static void main(String[] args) {

        int nums[] = {5,3,2,1};

        for(int i = 0; i < nums.length - 1; i++) {

            int smallestIndex = i;

            for(int j = i + 1; j < nums.length; j++) {

                if(nums[j] < nums[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // swap
            int temp = nums[i];
            nums[i] = nums[smallestIndex];
            nums[smallestIndex] = temp;
        }

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}