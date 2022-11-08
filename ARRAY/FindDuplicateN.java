import java.util.Arrays;

public class FindDuplicateN {
    public static void main(String[] args) {
        int [] arr ={3,3,6,7,8};
        System.out.println(Arrays.toString(arr));
        int ans = findduplicate(arr);
        System.out.println(ans);
    }

    private static int findduplicate(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int index = Math.abs(arr[i]);
            if(arr[index]<0)return index;
            arr[index]=-arr[index];
        }
        return -1;
    }
}