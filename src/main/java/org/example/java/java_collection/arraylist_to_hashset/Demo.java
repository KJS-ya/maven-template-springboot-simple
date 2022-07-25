package org.example.java.java_collection.arraylist_to_hashset;

/**
 * In this post, we are going to convert ArrayList to HashSet in Java.
 * ArrayList is an implementation class of List interface whereas HashSet is an implementation class of Set interface.
 *
 * If we want to get a collection of unique elements then we can use HashSet.
 * The conversion of ArrayList to HashSet will remove all the duplicate elements of the ArrayList.
 *
 * Although there are several ways to convert ArrayList to HashSet,
 * here we are using some common ways like using add() method or HashSet constructor or Stream API for the latest java version.
 *
 * Time for an Example:
 * Let's take an example to get HashSet from ArrayList.
 * Here, we are passing ArrayList to HashSet constructor to get a collection of unique elements. See the example below.
 */
import java.util.ArrayList;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Apple");
        System.out.println(arrList);
        // ArrayList to HashSet
        HashSet<String> hashSet = new HashSet<String>(arrList);
        System.out.println("HashSet:");
        System.out.println(hashSet);
    }
}
