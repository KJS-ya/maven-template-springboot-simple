package org.example.java.java_collection.sort_arraylist;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * In this post, we are going to sort an ArrayList in Java.
 * ArrayList is a class that is an implementation of List interface and used to store data.
 *
 * Sorting is one of the fundamental operations of data that we use in day to day programming.
 *
 * To sort an ArrayList there are several ways such as using sort() method of List or sort() method of Collections class or sorted() method of stream API.
 *
 * We can use any of these sorting techniques based on the requirement like if we are working with stream then sorted() method will be helpful to get a sorted ArrayList.
 *
 * Time for an Example:
 * Let's create an example to sort an ArrayList. Here we are using the sort() method that requires comparator argument and sorts the specified list.
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1030);
        arrList.add(1020);
        arrList.add(1010);
        arrList.add(1040);
        System.out.println(arrList);
        //Sorting ArrayList
        arrList.sort(Comparator.comparing(Integer::new));
        System.out.println("After sorting");
        System.out.println(arrList);
    }
}
