package org.example.lanbda;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //Traversing using foreach
        System.out.println("Traversing using foreach");
        for (Integer element:list) {
            System.out.println(element);
        }
        //lambda expression
        System.out.println("Traversing using lambda expression");
        list.forEach(element->System.out.println(element));
    }
}
