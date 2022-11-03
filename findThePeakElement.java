/*
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words,
an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
* */

public class findThePeakElement {
    public static void main(String[] args) {
        int [] arr ={1,2,3,1};
//        System.out.println(arr.length);
//        int ans = findpeakElement(arr);
//        System.out.println(ans+" is the peak element ");
//        System.out.println(arr.length);
        int ans2 = findpeakElementOptimal(arr);
        System.out.println(ans2);
    }

    private static int findpeakElementOptimal(int[] arr) {
        if(arr.length==1){
            return 0;
        }
        int low = 0;
        int high = arr.length-1;
        while (low<high){
            int mid = low +(high-low)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid == arr.length-1 ||arr[mid]>arr[mid+1])) return mid;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low= mid+1;
            }
        }
        return high;
    }

    private static int findpeakElement(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        for (int i = 0; i < arr.length; i++) {
            if(i==0 && arr[0]>arr[1]) return arr[0];
            if(i==arr.length-1 && arr[i]>arr[i-1]) return arr[arr.length-1];
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]) return arr[i];
        }
        return -1;
    }
}