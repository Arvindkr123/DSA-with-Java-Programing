import java.util.ArrayList;
import java.util.Arrays;


//public class Que1 {
//    public static void main(String[] args) {
//        int [] arr = {1,2,1};
//        int[] ans = new int[2*arr.length];
//        for (int i = 0; i <ans.length; i++) {
//            ans[i] = arr[i%arr.length];
//        }
//        System.out.println(Arrays.toString(ans));
//    }
//}


public class Que1 {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int n = arr.length;
        int[] ans = new int[2*arr.length];
        for (int i = 0; i <n; i++) {
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
/*Difference Reference type and primitive type
* with help of reference type we can create the new data type
* for example array and class etc
*
* primitive data type
* are like int float char etc */


