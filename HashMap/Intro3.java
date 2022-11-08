// Java program to Demonstrate the HashMap(int initialCapacity) constructor

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//public class Intro3 {
//    public static void main(String[] args) {
//        // we set here the initial capacity here
//        HashMap<Integer, String> hm1 = new HashMap<>(10);
//        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
//
//        // Adding the element using put method Custom input element
//        hm1.put(1, "One");
//        hm1.put(2,"Two");
//        hm1.put(3,"Three");
//
//        hm2.put(4,"Four");
//        hm2.put(5,"Five");
//        hm2.put(6,"Six");
//
//        System.out.println("Mapping of hashmap hm1 are : "+hm1);
//        System.out.println("Mappign of hashmap hm2 are : "+hm2);
//    }
//}



//public class Intro3 {
//    public static void main(String[] args) {
//        // we set here the initial capacity here
//        HashMap<Integer, String> hm1 = new HashMap<>(5, 0.75f);
//        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(3, 0.5f);
//
//        // Adding the element using put method Custom input element
//        hm1.put(1, "One");
//        hm1.put(2,"Two");
//        hm1.put(3,"Three");
//
//        hm2.put(4,"Four");
//        hm2.put(5,"Five");
//        hm2.put(6,"Six");
//
//
//        System.out.println("Mapping of hashmap hm1 are : "+hm1);
//        System.out.println("Mappign of hashmap hm2 are : "+hm2);
//
//    }
//}

public class Intro3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("China",150);
        map.put("US",30);
        System.out.println(map);
        for(Map.Entry<String,Integer> e1 : map.entrySet()){
            System.out.print(e1.getKey());
            System.out.println("   :"+e1.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key +"  "+map.get(key));
        }
    }
}