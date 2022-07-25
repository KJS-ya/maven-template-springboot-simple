package org.example.java.java_collection.array_to_arraylist;

import java.util.ArrayList;

/**
 * Create an ArrayList From an Array in Java
 * In this tutorial, we will learn about how to create an ArrayList from an Array in Java.
 * ArrayList belongs to java.util package. ArrayList has a variable size and this characteristic makes it a better choice over arrays. Primarily there are three ways of doing this :
 *
 * 1.By adding each element of the array to ArrayList explicitly.
 * 2.By using Arrays.asList() method.
 * 3.By using Collections.addAll() method
 * Example 1:
 * Creating an ArrayList from an Array by adding each element to an ArrayList from an Array.
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> courses= new ArrayList<>();
        String array[] = {"Java","Python","C","C++"};
        for (int i = 0; i < array.length; i++) {
            courses.add(array[i]);
        }
        for (String cours : courses) {
            System.out.println(cours);
        }
    }
}
