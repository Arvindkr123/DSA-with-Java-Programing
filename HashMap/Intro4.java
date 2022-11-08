// Java Program to demonstrate the HashMap(Map map) Constructor


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Intro4 {
    public static void main(String[] args) {

        Map<Integer, String> hm1 = new HashMap<>();
        // add elements using put method
        hm1.put(1,"One");
        hm1.put(2,"Two");
        hm1.put(3,"Three");

        HashMap<Integer, String> hm2 = new HashMap<>(hm1);
        System.out.println("Mapping of HashMap hm1 are : "+hm1);
        System.out.println("Mapping of HashMap hm2 are : "+hm2);

    }
}