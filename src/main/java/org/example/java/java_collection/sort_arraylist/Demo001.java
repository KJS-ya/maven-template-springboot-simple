package org.example.java.java_collection.sort_arraylist;
/**
 * Let's create another example to sort an ArrayList.
 * Here, we are using sort() method of Collections class that takes an argument and sort the list.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Demo001 {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1030);
        arrList.add(1020);
        arrList.add(1010);
        arrList.add(1040);
        System.out.println(arrList);
        // Sorting ArrayList
        Collections.sort(arrList);
        System.out.println("After Sorting:");
        System.out.println(arrList);
    }
}