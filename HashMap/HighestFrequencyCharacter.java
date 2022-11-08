import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int oldFreq = map.get(ch);
                int newfreq = oldFreq+1;
                map.put(ch,newfreq);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
        char mfc = str.charAt(0);
        for(Character key : map.keySet()){
            if(map.get(key)>map.get(mfc)){
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}