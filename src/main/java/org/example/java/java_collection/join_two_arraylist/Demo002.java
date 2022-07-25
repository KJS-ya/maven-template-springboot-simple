package org.example.java.java_collection.join_two_arraylist;

/**
 * Example: Join Unique Elements
 * If you want to collect only unique elements from two different ArrayLists then you can use distinct() method with flatMap() that returns a list of unique elements. See the example below.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo002 {
    public static void main(String[] args){
        ArrayList<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1030);
        arrList1.add(1020);
        arrList1.add(1010);
        arrList1.add(1040);
        System.out.println(arrList1);
        // Join two ArrayList
        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(1050,1030,1070));
        System.out.println(arrList2);
        List<Integer> arrList3 = Stream.of(arrList1, arrList2)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("After Joining:");
        System.out.println(arrList3);

    }
}