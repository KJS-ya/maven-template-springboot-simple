package org.example.java.java_collection.array_to_arraylist;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Example: Creating an ArrayList from an Array using Collections.addAll() method.
 * In this example, addAll() method from the Collections class will convert Arrays to Arraylist.
 * We pass two parameters to the addAll method i.e. ArrayList and array.
 */
public class Demo002 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        String array[]={"C", "C++", "Java", "Python","Java"};
        Collections.addAll(courses,array);
        for (String cours : courses) {
            System.out.println(cours);
        }
    }
}
