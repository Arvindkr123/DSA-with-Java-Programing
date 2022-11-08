/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
 with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
* */

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int []arr ={1,1,1,0,0,0,0,2,2,2,2,2,2};
        sortcolor(arr);

    }

    private static void sortcolor(int[] arr) {
        int zero=0,one=0,two=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)zero++;
            if(arr[i]==1)one++;
            if(arr[i]==2)two++;
        }
        System.out.println("One "+one);
        System.out.println("two "+two);
        System.out.println("zero "+zero);
        for (int i = 0; i <zero; i++) {
            arr[i]=0;
        }
        for (int i = zero; i <zero+one; i++) {
            arr[i]=1;
        }
        for (int i = zero+one; i <arr.length; i++) {
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}