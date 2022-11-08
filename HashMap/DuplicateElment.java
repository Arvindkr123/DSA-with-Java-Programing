import java.util.HashSet;
import java.util.Set;

public class DuplicateElment {
    public static void main(String[] args) {
        int [] arr ={1,1,1,3,3,4,3,2,4,2};
        int [] arr1 = {1,2,3,1};
        int arr2[] ={1,2,3,1};
//        boolean flag =isduplicate(arr2);
//        System.out.println(flag);
//        boolean flag2 =isduplicate1(arr2);
//        System.out.println(flag2);
//        System.out.println(contains_dupl);
        System.out.println(findduplicate(arr2));
        System.out.println(usingHashSet(arr2));


    }

    public static boolean usingHashSet(int [] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(hashSet.contains(arr[i])){
                hashSet.add(arr[i]);
                return true;
            }else{
                hashSet.add(arr[i]);
            }
        }
        return false;
    }
    private static boolean findduplicate(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int index = Math.abs(arr[i]);
            if(arr[index]<0)return true;
            arr[index]=-arr[index];
        }
        return false;
    }
    private static boolean isduplicate1(int[] arr2) {
        for (int i = 0; i <arr2.length; i++) {

            // get the element corresponding to
            int index = Math.abs(arr2[i]-1);

            // if number is already negative, it means we are encountering it twice
            if(arr2[index]<0){
                arr2[i] = arr2[index+1];
                return true;
            }

            arr2[index] = arr2[index]*-1;
        }
        return false;
    }

    private static boolean isduplicate(int[] arr) {
        if(arr.length==0){
            return false;
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}