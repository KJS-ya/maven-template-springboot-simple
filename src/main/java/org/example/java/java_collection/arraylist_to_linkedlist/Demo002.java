package org.example.java.java_collection.arraylist_to_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Example: Java 8
 * If you are using Java 8 or higher version then you can get the advantage of Java Stream API to convert ArrayList to LinkedList.
 * Here, we are using stream to collect ArrayList elements into LinkedList.
 */
public class Demo002 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mango");
        arrayList.add("Apple");
        arrayList.add("Orange");
        System.out.println(arrayList);
        //ArrayList to LinkedList
        LinkedList<String> linkedList = arrayList.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Linked List: ");
        System.out.println(linkedList);
    }
}
