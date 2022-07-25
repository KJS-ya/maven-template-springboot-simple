package org.example.java.java_collection.arraylist_to_hashset;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Let's create another example to convert ArrayList to HashSet.
 * Here, we are using add() method to add each element one by one to HashSet and get a unique collection of elements.
 */
public class Demo001 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Apple");
        System.out.println(arrList);
        // ArrayList to HashSet
        HashSet<String> hashSet = new HashSet<String>();
        for (String arr : arrList) {
            hashSet.add(arr);
        }
        System.out.println("HashSet:");
        System.out.println(hashSet);
    }
}
