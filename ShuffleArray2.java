import java.util.Arrays;

public class ShuffleArray2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,3,2,1};
        int n = arr.length;
        System.out.println(n);
        System.out.println(Arrays.toString(arr));
        int[] res = getShuffleArray(arr,n/2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] getShuffleArray(int[] arr, int n) {
        int[] res = new int[n*2];
        for (int i = 0; i <arr.length; i++) {
            res[i] = i%2==0?arr[i/2]:arr[n+i/2];
        }
        return res;
    }
}