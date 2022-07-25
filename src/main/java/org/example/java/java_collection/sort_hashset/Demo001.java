package org.example.java.java_collection.sort_hashset;

/**
 * Example 1
 * Let's create another example of sort the HashSet elements.
 * Here, we are using the sort() method of the Collections class that returns a list of sorted elements.
 * This example is useful when you want to get sorted elements no matter it is set or a list.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo001 {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(14);
        set.add(20);
        set.add(50);
        set.add(10);
        System.out.println(set);
        // Sorting
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
