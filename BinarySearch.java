/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
* */

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        int ans = binarysearch(arr,9);
        System.out.println(ans);
    }

    private static int binarysearch(int[] arr, int k) {
        int low=0;
        int high = arr.length-1;

        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            } else if (arr[mid]<k) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return 0;
    }
}