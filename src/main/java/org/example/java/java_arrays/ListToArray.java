package org.example.java.java_arrays;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        //Creating an ArrayList
        List<String> strList = new ArrayList<String>();
        strList.add("this");
        strList.add("is");
        strList.add("a");
        strList.add("string");
        strList.add("array");
        //Converting to array
        String[] strArr = strList.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
    }
}
