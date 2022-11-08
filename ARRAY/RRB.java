import org.w3c.dom.ls.LSOutput;

public class RRB {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,0,1,2,3,4,5};
        int ans = search(arr,0);
        System.out.println(ans);
        

    }

    private static int search(int[] arr, int target){
        int left=0;
        int right =arr.length-1;
        if(left>right)return -1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[left]<=arr[mid]) {
                // arr left part should be less than of arr of mid
                if(target>=arr[left] && arr[mid]>=target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else if(arr[mid]<=arr[right]){
                if(target>=arr[mid] && arr[right]>=target){
                    left = mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return -1;
        
        
    }

}