package org.example.java.java_collection.arraylist_to_linkedlist;
/**
 * Time for an Example:
 * Let's take an example to convert ArrayList to LinkedList.
 * Here we are passing ArrayList elements to the LinkedList constructor and getting a new data structure
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        System.out.println(arrList);
        // ArrayList to LinkedList
        LinkedList<String> linkList = new LinkedList<>(arrList);
        System.out.println("Linked List:");
        System.out.println(linkList);
    }
}