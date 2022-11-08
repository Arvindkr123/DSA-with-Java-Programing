/*
 We can use the Iterator interface to traverse over any structure of the Collection Framework.
 Since Iterators work with one type of data we use Entry< ? , ? > to resolve the two separate types into a compatible format.
 Then using the next() method we print the entries of HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class TraversalHashMAp {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // iterate the using foreach
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println("key : "+e.getKey() + ": Value : "+e.getValue());
        }

    }
}