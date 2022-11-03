import java.util.Arrays;

public class Lecture2_FindTheMinAndMax {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        findMinandMax(arr);
    }

    private static void findMinandMax(int[] arr) {
        if(arr==null || arr.length==0)return;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>min){
//                min = arr[i];
//            }
//            if(arr[i]<max){
//                max = arr[i];
//            }

            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
        }
        System.out.println("Min "+min);
        System.out.println("Max "+max);
    }
}