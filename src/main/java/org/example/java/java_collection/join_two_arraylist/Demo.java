package org.example.java.java_collection.join_two_arraylist;

/**
 * In this post, we are going to join two ArrayList in Java. ArrayList is an implementation class of List interface in the collection framework and used to store data.
 *
 * Joining two ArrayList is actually a process of combining two ArrayList elements into a single ArrayList.
 * It is helpful when we have multiple data streams and want to collect them into a single stream.
 *
 * To Join ArrayList we used the addAll() method of List and flatMap() method of stream API.
 *
 * The addAll() method adds is used to add elements of one ArrayList to another and takes a single argument.
 * Let's see the examples.
 *
 * Time for an Example:
 * Let's create an example to join two ArrayList.
 * Here we are using addAll() method and passed arrList2 to as an argument and see we get all the elements into a single ArrayList.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args){
        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1030);
        arrList1.add(1020);
        arrList1.add(1010);
        arrList1.add(1040);
        System.out.println(arrList1);
        // Join two ArrayList
        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(1050,1060,1070));
        System.out.println(arrList2);
        arrList1.addAll(arrList2);
        System.out.println("After Joining:");
        System.out.println(arrList1);

    }
}
