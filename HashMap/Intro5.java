import java.util.HashMap;

// Performing the various operations on HashMap
/* 1. Adding Elements: In order to add an element to the map, we can use the put() method. However,
the insertion order is not retained in the Hashmap. Internally, for every element, a separate hash is generated
 and the elements are indexed based on this hash to make it more efficient.
* */
public class Intro5 {
    public static void main(String[] args) {

        HashMap<Integer, String> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<>();
        // Add the element using the put method
        hm1.put(1,"Geeks");
        hm1.put(2,"For");
        hm1.put(3,"Geeks");

        hm2.put(1,"Geeks");
        hm2.put(2,"For");
        hm2.put(3,"Geeks");
        System.out.println("Mapping of hashMap hm1 are : "+hm1);
        System.out.println("Mapping of hashMap hm2 are : "+hm2);
    }
}