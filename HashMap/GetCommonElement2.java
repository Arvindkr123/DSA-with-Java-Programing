import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElement2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int [] a1 = new int[n1];
        for (int i = 0; i <a1.length ; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i <a2.length ; i++) {
            a2[i] = scn.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : a1){
            if(map.containsKey(val)){
                int olf = map.get(val);
                int newf = olf+1;
                map.put(newf,val);
            }else{
                map.put(val,1);
            }
        }
        System.out.println(map);
        for(int val : a2){
            if(map.containsKey(val) && map.get(val)>0){
                System.out.println(val);
                int oldf =map.get(val);
                int newf = oldf -1;
                map.put(newf,val);
            }
        }
        System.out.println(map);
    }
}