import java.util.Arrays;

public class MoveNegOneSide {
    public static void main(String[] args) {
        int [] arr = {-1,-2,-3,-4,6,-7,8,9,-5};
        int left=0, right = arr.length-1;
        while (left<right){ // we run this till left less than right
            while (arr[left]<0)left++; // +ve this run till negative element
            while (arr[right]>0)right--; // -ve
            if(left>=right)break; // this is the edge the condition
            // swap here
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}