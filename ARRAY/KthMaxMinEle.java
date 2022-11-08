// Counting valley

import java.util.Arrays;

public class KthMaxMinEle {
    public static void main(String[] args) {
        int [] arr ={6,2,3,4,1,9};
        int k=3;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[k-1]);
        int ans = kthsmallestelement(arr,k);
        System.out.println(ans);

    }

    private static int kthsmallestelement(int[] arr, int k) {
        if(arr.length==0){
            return -1;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}