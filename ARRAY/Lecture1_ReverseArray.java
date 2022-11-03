// Reverse the Array

import java.util.ArrayList;
import java.util.Arrays;

//public class Lecture1_ReverseArray {
//    public static void main(String[] args) {
//        int [] arr ={1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void reverseArray(int[] arr) {
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//    }
//}

// Another approach
public class Lecture1_ReverseArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(arr));
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        recursiveapproach(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));




    }

    private static void recursiveapproach(int[] arr, int s, int e) {
        if(s>e)return;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        recursiveapproach(arr,s+1,e-1);
    }

    private static void reverseArray(int[] arr) {
//        int s =0;
//        int e = arr.length-1;
//        while (s<e){
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }

        int s=0;
        int e = arr.length-1;
        for (;s < e; s++,e--) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}