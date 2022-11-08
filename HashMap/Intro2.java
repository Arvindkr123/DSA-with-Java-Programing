// Java program to demonstrate the HashMap() constructor

import java.util.HashMap;

public  class Intro2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<>();
//      Initialize the hashmap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Adding the element using put method Custom input element
        hm1.put(1, "One");
        hm1.put(2,"Two");
        hm1.put(3,"Three");

        hm2.put(4,"Four");
        hm2.put(5,"Five");
        hm2.put(6,"Six");

        System.out.println("Mapping of hashmap hm1 are : "+hm1);
        System.out.println("Mappign of hashmap hm2 are : "+hm2);

    }
}
