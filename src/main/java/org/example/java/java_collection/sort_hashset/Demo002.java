package org.example.java.java_collection.sort_hashset;

/**
 * Example 2
 * If you are using Java 8 or higher Java version then you can use Stream API and its method sorted() that sort the stream elements and toList() method returns the list of these elements. See the example below.
 */
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo002{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(14);
        set.add(20);
        set.add(50);
        set.add(10);
        System.out.println(set);
        // Sorting
        List<Integer> list = set.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}