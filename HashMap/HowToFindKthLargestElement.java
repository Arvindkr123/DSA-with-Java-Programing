import java.util.PriorityQueue;
import java.util.Scanner;
/* Input
8
2 10 5 17 7 18 6 4
3
* */
public class HowToFindKthLargestElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while (pq.size()>0){
            System.out.println(pq.remove());
        }

    }
}