import java.util.PriorityQueue;
import java.util.Scanner;
/*
9 number of element in array
2 3 1 4 6 7 5  8 9  given value to arr
2   this is kth value
1 2 3 4 5 6 7 8 9  this is the output
* */
public class HowToSortNearlySortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <=k ; i++) {
            pq.add(arr[i]);
        }

        for (int i = k+1; i <arr.length; i++) {
            System.out.print(pq.remove()+" ");
            pq.add(arr[i]);
        }

        while (pq.size()>0){
            System.out.print(pq.remove()+" ");
        }
    }
}