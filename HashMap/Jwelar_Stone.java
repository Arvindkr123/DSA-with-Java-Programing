import java.util.HashMap;
import java.util.Scanner;

public class Jwelar_Stone {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String jw  = scn.next();
        String stone = scn.next();
        int ans =numJewelsInStones1(jw,stone);
        System.out.println(ans);
        int ans1 =numJewelsInStones(jw,stone);
        System.out.println(ans1);
    }

    private static int numJewelsInStones1(String jw, String stone) {
        char[] temp = stone.toCharArray();
        int n =0;
        for (int i = 0; i <temp.length ; i++) {
            if(jw.indexOf(temp[i])!=-1){
                n++;
            }
        }
        return n;
    }

    private static int numJewelsInStones(String jw, String stone) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stone.length(); i++) {
            char ch = stone.charAt(i);
            if(map.containsKey(ch)){
                int old = map.get(ch);
                int nfq = old+1;
                map.put(ch,nfq);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        int ans =0;
        for (int i = 0; i <jw.length(); i++) {
            char ch = jw.charAt(i);
            if(map.containsKey(ch)){
                ans+=map.get(ch);
            }
        }
        return ans;
    }
}