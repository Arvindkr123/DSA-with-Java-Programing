import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

//public class PriorityQueue_Example {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        int [] ranks = {22, 3, 9, 11,88, 99,4};
//        for (int i: ranks){
//            pq.add(i);
//        }
//        while (pq.size()>0){
//            System.out.println(pq.peek());
//            pq.remove();
//        }
//
//    }
//}


// if you want to give the priority according to you
public class PriorityQueue_Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int [] ranks = {22, 3, 9, 11,88, 99,4};
        for (int i: ranks){
            pq.add(i);
        }
        while (pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}