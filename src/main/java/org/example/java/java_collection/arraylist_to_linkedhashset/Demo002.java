package org.example.java.java_collection.arraylist_to_linkedhashset;

/**
 * This is another approach that you can use to get LinkedHashSet from an ArrayList.
 * Here, we are passing ArrayList as an argument to the constructor of LinkedHashSet.
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo002 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Apple");
        System.out.println(arrList);
        // ArrayList to LinkedHashSet
        LinkedHashSet<String> linkSet = new LinkedHashSet<String>(arrList);
        System.out.println("Linked HashSet:");
        System.out.println(linkSet);
    }
}