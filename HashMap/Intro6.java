// Changing the element : After adding the element if we wish to change the element, it can be done by again adding the element
// with help of put method. Since the elements in the map are indexed using the keys, the value of the key can be changed by simply
// inserting the updated value for the key for which we wish to change

import java.util.HashMap;

public class Intro6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        // Change the value using the put method
        hm.put(1,"Geeks");
        hm.put(2,"Geeks");
        hm.put(3,"Geeks");
        System.out.println("Initial Map : "+hm);

        hm.put(2,"for");
        System.out.println("Updated map : "+hm);
    }
}