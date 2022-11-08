// Java code to illustrate add(Object o)
import java.io.*;
import java.util.ArrayList;

//public class ArraysList {
//    public static void main(String[] args)
//    {
//
//        // create an empty array list with an initial capacity
//        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
//
//        // use add() method to add elements in the list
//        arrlist.add(15);
//        arrlist.add(20);
//        arrlist.add(25);
//
//        // prints all the elements available in list
//        for (Integer number : arrlist) {
//            System.out.println("Number = " + number);
//        }
//    }
//}


// Java code to illustrate
// void add(int index, Object element)
import java.io.*;
import java.util.ArrayList;

//public class ArraysList {
//    public static void main(String[] args)
//    {
//
//        // create an empty array list with an initial capacity
//        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
//
//        // use add() method to add elements in the list
//        arrlist.add(10);
//        arrlist.add(22);
//        arrlist.add(30);
//        arrlist.add(40);
//
//        // adding element 35 at fourth position
//        arrlist.add(3, 35);
//
//        // let us print all the elements available in list
//        for (Integer number : arrlist) {
//            System.out.println("Number = " + number);
//        }
//    }
//}

// Java program to demonstrate the
// working of ArrayList in Java

import java.io.*;
import java.util.*;

//public class ArraysList {
//    public static void main(String[] args)
//    {
//        // Size of the
//        // ArrayList
//        int n = 5;
//
//        // Declaring the ArrayList with
//        // initial size n
//        ArrayList<Integer> arrli = new ArrayList<Integer>(n);
//
//        // Appending new elements at
//        // the end of the list
//        for (int i = 1; i <= n; i++)
//            arrli.add(i);
//
//        // Printing elements
//        System.out.println(arrli);
//
//        // Remove element at index 3
//        arrli.remove(3);
//
//        // Displaying the ArrayList
//        // after deletion
//        System.out.println(arrli);
//
//        // Printing elements one by one
//        for (int i = 0; i < arrli.size(); i++)
//            System.out.print(arrli.get(i) + " ");
//    }
//}


// Java program to demonstrate the
// working of ArrayList in Java

import java.io.*;
import java.util.*;

public class ArraysList {
    public static void main(String[] args)
    {

        // Declaring the ArrayList without mentioned its
        // size
        ArrayList<Integer> arrli = new ArrayList<>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
    }
}
