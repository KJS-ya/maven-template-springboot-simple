package org.example.java.java_collection.sort_hashset;

/**
 * In this post, we are going to sort HashSet elements in Java. HashSet is an implementation class of Set interface in Java that is used to store data but does not maintain any order.
 *
 * To sort and HashSet there are several methods like convert HashSet to TreeSet or sort() method of Collections class or using sorted() method of the stream.
 *
 * Since HashSet does not guarantee insertion order and does not store elements in sorting order then Java provides TreeSet to store sorted data.
 *
 * Time for an Example:
 * Let's create an example to get HashSet elements sorted. Here, we are converting HashSet elements to TreeSet that stores elements in sorted order.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(14);
        set.add(20);
        set.add(50);
        set.add(10);
        System.out.println(set);
        // Sorting
        set = new TreeSet<>(set);
        System.out.println(set);
    }
}