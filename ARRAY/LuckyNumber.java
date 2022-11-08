/*Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
Return the largest lucky integer in the array. If there is no lucky integer return -1
Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
*/

import java.util.HashMap;
import java.util.Map;

public class LuckyNumber {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,3,4,4,4,4};
//        int ans = luckyNumberFind(arr);
//        System.out.println(ans);

//       int ans = luckyNumberFindUsingHashMap(arr);
        int ans = findLucky(arr);
        System.out.println(ans);
    }

//    private static int luckyNumberFindUsingHashMap(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(i, arr[i]);
//
//        }
//
//    }
    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int res = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getKey() == entry.getValue() )
            {
                res = entry.getKey();
            }
        }

        if(res == 0)
        {
            return -1;
        }
        return res;
    }

//    private static int luckyNumberFind(int[] arr) {
//        int[] count = new int[501];
//        for(int i : arr){
//            count[i]++;
//        }
//
//        for (int i = arr.length-1; i >0 ; i--) {
//            if(count[i]==i){
//                return i;
//            }
//        }
//        return -1;
//    }
}