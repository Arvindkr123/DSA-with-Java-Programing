import java.util.HashSet;
import java.util.Set;

//public class SetIntro1 {
//    public static void main(String[] args) {
//        // Creating an empty Set
//        Set<String> s = new HashSet<String>();
//
//        // Use add() method to add elements into the Set
//        s.add("Welcome");
//        s.add("To");
//        s.add("Geeks");
//        s.add("4");
//        s.add("Geeks");
//        s.add("Set");
//
//        // Displaying the Set
//        System.out.println("Set: " + s);
//    }
//}


// Java code to illustrate add() method
import java.io.*;
import java.util.*;

public class SetIntro1 {
    public static void main(String args[])
    {
        // Creating an empty Set
        Set<Integer> s = new HashSet<Integer>();

        // Use add() method to add elements into the Set
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);

        // Displaying the Set
        System.out.println("Set: " + s);
    }
}
