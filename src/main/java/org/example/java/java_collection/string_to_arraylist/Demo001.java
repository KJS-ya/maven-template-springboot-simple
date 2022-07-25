package org.example.java.java_collection.string_to_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * If we have an array of strings then we don't need to split() method.
 * We can directly pass this array into asList() method to get ArrayList. See the example below.
 */
public class Demo001 {
    public static void main(String[] args) {
        String[] msg = {"StudyTonight.com","tutorial","java","string"};
        System.out.println(msg.length);
        //string[] to arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(msg));
        list.forEach(System.out::println);
    }
}
