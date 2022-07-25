package org.example.java.java_collection.sort_arraylist;

/**
 * Example: Java 8
 * If you are working on Java 8 or higher version then you can take advantage of stream API to sort an ArrayList.
 * Here, we are using the sorted() method of the stream that helps to sort stream elements.
 */
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Demo002 {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1030);
        arrList.add(1020);
        arrList.add(1010);
        arrList.add(1040);
        System.out.println(arrList);
        // Sorting ArrayList
        arrList = (ArrayList<Integer>)arrList.stream().sorted().collect(Collectors.toList());
        System.out.println("After Sorting:");
        System.out.println(arrList);
    }
}
