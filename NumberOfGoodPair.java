/*   1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
* */

public class NumberOfGoodPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int ans = numberofGoodPair(arr);
        System.out.println(ans);
        int res = GoodApproach(arr);
        System.out.println(res);
    }

    // Another approach
    private static int GoodApproach(int[] arr) {
        int res =0;
        int[] temp = new int[101];
        for (int i = 0; i <arr.length ; i++) {
            res+= temp[arr[i]];
            temp[arr[i]]++;
        }
        return res;
    }

    private static int numberofGoodPair(int[] arr) {
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j] & i<j){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}