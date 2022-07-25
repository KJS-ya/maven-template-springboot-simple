package org.example.java.java_collection.arraylist_to_hashset;

/**
 * If you are using Java 8 or higher version then you can use the advantage of Stream API that makes our conversion code more concise and compact.
 * Here, we are collecting ArrayList elements as HashSet using stream.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Demo002 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Apple");
        System.out.println(arrList);
        // ArrayList to HashSet
        HashSet<String> hashSet = arrList.stream().collect(Collectors.toCollection(HashSet::new));//与sort_hashset和sort_arraylist的方法不同此处返回值是由hashset来接收
        System.out.println("HashSet:");
        System.out.println(hashSet);
    }
}
