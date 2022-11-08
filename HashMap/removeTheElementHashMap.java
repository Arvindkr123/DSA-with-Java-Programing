import java.util.HashMap;

public class removeTheElementHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        // Change the value using the put method
        hm.put(1,"Geeks");
        hm.put(2,"for");
        hm.put(3,"Geeks");
        hm.put(4,"for");
        System.out.println("Initial Map : "+hm);
        hm.remove(4);
        System.out.println("After remove : "+hm);
    }
}