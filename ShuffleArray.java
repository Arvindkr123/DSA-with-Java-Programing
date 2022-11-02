import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,3,2,1};
        Solution solution = new Solution(arr,new Random());
        int []result = solution.shuffle();
        System.out.println(Arrays.toString(result));
    }
}

class Solution{
    private int[] nums;
    private Random random;

    public Solution(int[] nums, Random random) {
        this.nums = nums;
        this.random = random;
    }
    public int[] reset(){
        return  nums;
    }

    public int[] shuffle(){
        int[] randomArray = nums.clone(); // it copy the content of array
        for (int i = nums.length-1; i >0 ; i--) {
            int j = random.nextInt(i+1); // o to uptill length-1
            int t = randomArray[i];
            randomArray[i] = randomArray[j];
            randomArray[j] = t;
        }
        return randomArray;
    }
}