public class Lecture3_SearchInRottatedArray {
    public static void main(String[] args) {
        int [] arr = {7,8,9,0,1,2,3,4,5,6};
        int ans =search(arr,3,0,arr.length-1);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target, int st, int ed) {
        if(st>ed){
            return -1;
        }
        int mid = st+(ed-st)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[st]<=arr[mid]){
            if(target >= arr[st] && target <= arr[mid]){
                return search(arr,target,st, mid-1);
            }else{
                return search(arr,target,mid+1, ed);
            }
        }

        if(target >= arr[mid] && target <= arr[ed]){
            return search(arr,target,mid+1,ed);
        }else{
            return search(arr, target,st,mid-1);
        }
    }


//    private static int searchInRottatedArray(int[] arr, int target, int left, int right) {
//        if(left>right){
//            return -1;
//        }
//        // mid element
//        int mid = left+(right-left)/2;
//        if(arr[mid]==target){
//            return mid;
//        }
//        // if left half is sorted
//        if(arr[mid]>=arr[left]){
//
//            if(arr[left]<=target && target <= arr[mid]){ // if key in left half array
//                searchInRottatedArray(arr,target,left,mid-1);
//            }else{
//                searchInRottatedArray(arr,target,mid+1,right);
//            }
//        }else{ // right half is sorted
//            // if key in the right half the array
//            if(arr[mid]<=target && target<=arr[right]){
//                searchInRottatedArray(arr,target,mid+1,right);
//            }else{
//                searchInRottatedArray(arr,target,left,mid-1);
//            }
//        }
//        return left;
//    }
}