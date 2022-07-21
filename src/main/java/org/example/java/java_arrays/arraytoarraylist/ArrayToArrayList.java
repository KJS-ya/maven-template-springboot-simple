package org.example.java.java_arrays.arraytoarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Orange","Banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(fruits));
        System.out.println(arrayList);
    }
}
