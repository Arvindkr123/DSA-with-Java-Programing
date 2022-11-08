/* Two Sum

Beginners Classes - https://unacademy.com/a/beginners-cla...
Intermediate Classes - https://unacademy.com/a/intermediate-...
Advanced Classes - https://unacademy.com/a/advanced-clas...

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Input: nums = [3,2,4], target = 6
Output: [1,2]
* */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        int target = 6;
//        int [] ans = twoSum(arr,target);
//        System.out.println(Arrays.toString(ans));
//        int[] ans1 = OptimalApproach(arr,target);
//        System.out.println(Arrays.toString(ans1));
        int [] ans = otherapproach(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] otherapproach(int[] arr, int target) {
        int[] res= new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(target-arr[i])){
                res[1] = i;
                res[0] = map.get(target-arr[i]);
                return res;
            }
            map.put(arr[i],i);
        }
        return res;
    }

    private static int[] OptimalApproach(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // check if the element present or not
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}


