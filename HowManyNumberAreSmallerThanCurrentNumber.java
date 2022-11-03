/* In this problem we check how many number are smaller than the current number
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation:
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1).
For nums[3]=2 there exist one smaller number than it (1).
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

Constraints:

2 <= nums.length <= 500
0 <= nums[i] <= 100

* */


import java.util.Arrays;

public class HowManyNumberAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = getTheHowManyNumberAreSmallerThanCurrentNumber(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] getTheHowManyNumberAreSmallerThanCurrentNumber(int[] arr) {
        int[] bucket = new int[101];

        // get the frequency
        for(int i: arr){
            bucket[i]++;
        }
        // Count the number smaller than each element
        for (int i = 1; i <bucket.length; i++) {
            bucket[i]+=bucket[i-1];
        }
        // Populate the result
        int[] reslt = new int[arr.length];
        for (int i = 0; i <reslt.length; i++) {
            if(arr[i]==0){
                reslt[i]=0;
            }else{
                reslt[i] = bucket[arr[i]-1];
            }
        }
        return reslt;
    }
}