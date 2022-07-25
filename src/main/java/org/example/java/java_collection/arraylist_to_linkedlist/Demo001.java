package org.example.java.java_collection.arraylist_to_linkedlist;
/**
 * Another Example:
 * Let's create another example to convert ArrayList to LinkedList.
 * Here, we are using add() method to add elements to LinkedList.
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo001 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        System.out.println(arrList);
        // ArrayList to LinkedList
        LinkedList<String> linkList = new LinkedList<>();
        for (String arr : arrList) {
            linkList.add(arr);
        }
        System.out.println("Linked List:");
        System.out.println(linkList);
    }
}