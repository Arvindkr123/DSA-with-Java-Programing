import java.util.HashMap;
import java.util.Scanner;

/*
11
10 5 9  1 11 8 6 153 12 2
*/

public class LongestConscutiveSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        HashMap<Integer, Boolean> map = new HashMap<>();

        // put the true value in front of the all array value
        for(int i:arr){
            map.put(i,true);
        }
        System.out.println(map);
        // make false value and if that number has the n-1 value
        for(int val:arr){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        System.out.println(map);
        // third loop
        int max_start_point=0;
        int max_length=0;
        for(int val : arr){
            if(map.get(val)==true){
                int temp_length=1;
                int temp_start_point =val;
                while (map.containsKey(temp_length+temp_start_point)){
                    temp_length++;
                }
                if(temp_length>max_length){
                    max_start_point =temp_start_point;
                    max_length = temp_length;
                }
            }
        }

        for (int i = 0; i <max_length ; i++) {
            System.out.print(max_start_point+i +"  ");
        }
//        System.out.println(map);
    }
}