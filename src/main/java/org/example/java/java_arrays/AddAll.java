package org.example.java.java_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {
        //Converting a string array
        String[] strArr = {"this", "is", "a", "string", "array"};
        List<String> strList = new ArrayList<String>();
        Collections.addAll(strList, strArr);
        System.out.println(strList);
        //Converting a integer array
        Integer[] intArr = {2, 3, 5, 7, 11, 13, 17};
        List<Integer> intList = new ArrayList<Integer>();
        Collections.addAll(intList, intArr);
        System.out.println(intList);

    }
}
