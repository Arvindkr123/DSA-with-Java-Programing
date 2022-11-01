import java.util.Arrays;

public class ConcatenationOfArray{
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int[] reslt = getConcatenationOfArray(arr);
        System.out.println(Arrays.toString(reslt));
    }

    public static int[] getConcatenationOfArray(int [] arr){
        int [] reslt = new int[2*arr.length];
        for (int i = 0; i < arr.length; i++) {
            reslt[i] = arr[i];
            reslt[i+arr.length] = arr[i];
        }
        return reslt;
    }
}