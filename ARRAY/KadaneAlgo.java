import java.util.Arrays;

//In this program we can find out the subarray of sum
//public class KadaneAlgo {
//    public static void main(String[] args) {
//        int [] arr ={1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        int ans = kadane(arr);
//        System.out.println(ans);
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i; j < arr.length ; j++) {
//                for (int k = i; k <=j ; k++) {
//                    System.out.print("["+arr[k]+"]");
//                }
//                System.out.println();
//            }
//        }
//    }
//
//    private static int kadane(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int sum =0;
//                for (int k = i; k <=j ; k++) {
//                    sum+=arr[k];
//                }
//                max = Math.max(sum,max);
//            }
//        }
//        return max;
//    }
//}

public class KadaneAlgo {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
//        int ans = kadane(arr);
//        System.out.println(ans+" ");
        int ans = optimalSolution(arr);
        System.out.println(ans);
    }

    private static int optimalSolution(int[] arr) {
        int bestSum = Integer.MIN_VALUE;
        int currentSum=0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            bestSum = Math.max(bestSum,currentSum);
        }
        return bestSum;
    }

    private static int kadane(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length ; j++) {
                sum+=arr[j];
                max = Math.max(sum,max);
            }

        }
        return max;
    }
}