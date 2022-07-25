package org.example.java.java_collection.string_to_arraylist;

import java.util.ArrayList;

/**
 * Let's take another example to get ArrayList, Here,
 * we are using add() method to add string array elements to the ArrayList by traversing.
 * This is easiest and simple for beginners.
 */
public class Demo002 {
    public static void main(String[] args) {
        String[] msg = {"StudyTonight.com","tutorial","java","string"};
        System.out.println(msg.length);
        //string[] to ArrayList
        ArrayList<String> list = new ArrayList<>();
        for (String s : msg) {
            list.add(s);
        }
        System.out.println(list);
    }

}
