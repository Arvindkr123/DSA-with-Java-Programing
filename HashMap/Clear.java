import java.util.HashMap;

//public class Clear {
//    public static void main(String[] args) {
//        // Creating an empty HashMap
//        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//
//        // Mapping string values to int keys
//        hash_map.put(10, "Geeks");
//        hash_map.put(15, "4");
//        hash_map.put(20, "Geeks");
//        hash_map.put(25, "Welcomes");
//        hash_map.put(30, "You");
//
//        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + hash_map);
//
//        // Clearing the hash map using clear()
//        hash_map.clear();
//
//        // Displaying the final HashMap
//        System.out.println("Finally the maps look like this: " + hash_map);
        // Creating an empty HashMap
//        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
//
//        // Mapping int values to string keys
//        hash_map.put("Geeks", 10);
//        hash_map.put("4", 15);
//        hash_map.put("Geeks", 20);
//        hash_map.put("Welcomes", 25);
//        hash_map.put("You", 30);
//
//        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + hash_map);
//
//        // Clearing the hash map using clear()
//        hash_map.clear();
//
//        // Displaying the final HashMap
//        System.out.println("Finally the maps look like this: " + hash_map);
//    }
//}


// Java code to illustrate the remove() method
import java.util.*;

//public class Clear {
//    public static void main(String[] args) {
//
//        // Creating an empty HashMap
//        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//
//        // Mapping string values to int keys
//        hash_map.put(10, "Geeks");
//        hash_map.put(15, "4");
//        hash_map.put(20, "Geeks");
//        hash_map.put(25, "Welcomes");
//        hash_map.put(30, "You");
//
//        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + hash_map);
//
//        // Removing the existing key mapping
//        String returned_value = (String)hash_map.remove(20);
//
//        // Verifying the returned value
//        System.out.println("Returned value is: "+ returned_value);
//
//        // Displaying the new map
//        System.out.println("New map is: "+ hash_map);
//    }
//}


// Java code to illustrate the remove() method
import java.util.*;

//public class Clear {
//    public static void main(String[] args) {
//
//        // Creating an empty HashMap
//        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//
//        // Mapping string values to int keys
//        hash_map.put(10, "Geeks");
//        hash_map.put(15, "4");
//        hash_map.put(20, "Geeks");
//        hash_map.put(25, "Welcomes");
//        hash_map.put(30, "You");
//
//        // Displaying the HashMap
//        System.out.println("Initial Mappings are: " + hash_map);
//
//        // Removing the new key mapping
//        String returned_value = (String)hash_map.remove(50);
//
//        // Verifying the returned value
//        System.out.println("Returned value is: "+ returned_value);
//
//        // Displaying the new map
//        System.out.println("New map is: "+ hash_map);
//    }
//}

// Remove an Entry using value from HashMap while Iterating over it
//Given a HashMap and a value in Java, the task is to remove an entry from this HashMap using the value, while iterating over it.
//
//        Examples:
//
//        Input: HashMap: {1=Geeks, 2=ForGeeks, 3=GeeksForGeeks}, value = “ForGeeks”
//        Output: {1=Geeks, 3=GeeksForGeeks}
//
//        Input: HashMap: {1=G, 2=e, 3=e, 4=k, 5=s}, value = k
//        Output: {1=G, 2=e, 3=e, 5=s}

//Iterator>
//        iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//        Map.Entry entry = iterator.next();
//        if (valueToBeRemoved.equals(entry.getValue())) {
//        iterator.remove();
//        }
//        }

// Java program to remove an entry using value
// from a HashMap while iterating over it

import java.util.*;

//public class Clear {
//    public static void main(String[] args)
//    {
//
//        // Create a HashMap
//        HashMap<Integer, String>map = new HashMap<>();
//
//        // Populate the HashMap
//        map.put(1, "Geeks");
//        map.put(2, "ForGeeks");
//        map.put(3, "GeeksForGeeks");
//
//        // Get the value to be removed
//        String valueToBeRemoved = "ForGeeks";
//
//        // Print the initial HashMap
//        System.out.println("Original HashMap: "
//                + map);
//
//        // Get the iterator over the HashMap
//        Iterator<Map.Entry<Integer, String> >
//                iterator = map.entrySet().iterator();
//
//        // Iterate over the HashMap
//        while (iterator.hasNext()) {
//
//            // Get the entry at this iteration
//            Map.Entry<Integer, String>entry = iterator.next();
//
//            // Check if this value is the required value
//            if (valueToBeRemoved.equals(entry.getValue())) {
//
//                // Remove this entry from HashMap
//                iterator.remove();
//            }
//        }
//
//        // Print the modified HashMap
//        System.out.println("Modified HashMap: "
//                + map);
//    }
//}

// Java program to remove an entry using value
// from a HashMap while iterating over it

import java.util.*;

public class Clear {
    public static void main(String[] args)
    {

        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Populate the HashMap
        map.put(1, "Geeks");
        map.put(2, "ForGeeks");
        map.put(3, "GeeksForGeeks");

        // Get the value to be removed
        String valueToBeRemoved = "ForGeeks";

        // Print the initial HashMap
        System.out.println("Original HashMap: " + map);

        // Remove the specified entry from the Map
        map.entrySet()
                .removeIf(
                        entry -> (valueToBeRemoved.equals(entry.getValue())));

        // Print the modified HashMap
        System.out.println("Modified HashMap: "
                + map);
    }
}



