package org.example.java.java_collection.integerlist_to_array;

/**
 * Convert Integer List to Int Array in Java
 * In this article, we will learn how to convert Integer List to int Array in Java. There are two ways to Convert Integer List to array in Java
 *
 * 1.Using stream.mapToInt() method
 * 2.Using ArrayUtils.toPrimitive() method
 * Example: Converting Integer List to an Array using stream.mapToInt() method
 * In this example, we created a list of integers.
 * To change this ArrayList to the Array we called stream().mapToInt().toAttay() method on the list and the result of this will be assigned to array arr.
 */
import java.util.*;
public class Demo
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int[] arr = list.stream().mapToInt(i->i).toArray();
        for (int val : arr) {
            System.out.println(val);
        }
    }
}
