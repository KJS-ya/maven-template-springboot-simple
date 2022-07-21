package org.example.java.java_arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        //Converting a string array
        String[] strArr = {"this", "is", "a", "string", "array"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println(strList);

        //Converting an integer array
        Integer[] intArr = {2,3,5,7,11,13,17};
        List<Integer> intList = Arrays.asList(intArr);
        System.out.println(intList);
    }
}
