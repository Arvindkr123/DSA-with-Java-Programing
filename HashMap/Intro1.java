import java.util.HashMap;

public class Intro1 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        // Adding the element to the map using the standard put() method
        map.put("vishal",10);
        map.put("sachin",30);
        map.put("vaibhav",20);
        System.out.println("Size of the map is : "+map.size());
        System.out.println(map);

//        Checking if a key is present and if present print by passing
//        random element
        if(map.containsKey("vishal")){
            // mapping
            Integer a = map.get("vishal");
            System.out.println("value for key "+"\"vishal\" is : "+a);
        }
    }
}