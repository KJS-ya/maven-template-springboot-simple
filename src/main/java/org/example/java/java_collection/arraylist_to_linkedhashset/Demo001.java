package org.example.java.java_collection.arraylist_to_linkedhashset;

/**
 * If you want to add elements one by one to LinkedHashSet,
 * then you can use add() method and get a collection of unique elements. See the example below.
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo001 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Apple");
        System.out.println(arrList);
        // ArrayList to LinkedHashSet
        LinkedHashSet<String> linkSet = new LinkedHashSet<String>();
        for (String arr : arrList) {
            linkSet.add(arr);
        }
        System.out.println("Linked HashSet:");
        System.out.println(linkSet);
    }
}
