package org.example.java.java_collection.find_max_map;


import java.util.HashMap;
import java.util.Map;

/**
 * How To Find Maximum Value in Java Map
 * In this article, we will learn to sort elements of Java Map.
 * Map stores data in a key-value pair format and on top of that it stores in random locations,
 * that's why it is hard to find Max values in Map in Java.
 * <p>
 * Challenges To Finding Max Value In Java Map
 * 1.Map in Java stores value in random locations.
 * 2.Since it stores data in the key-value format it is necessary to decide which factor should consider for comparison.
 * Let's understand by a program using Map in Java. In the program given below,
 * we created a Map that will store the price for every corresponding course in key-value format.
 */
public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> coursePrice = new HashMap<>();
        coursePrice.put("Java", 5000);
        coursePrice.put("Python", 3000);
        coursePrice.put("CPP", 4000);
        coursePrice.put("Android", 8000);
        System.out.println(coursePrice);
        /**
         * Now, it is very obvious to think Which course is the cheapest? Which course is expensive?
         * In a programming world, we tackle these situations by simply finding the largest and smallest value.
         * Before moving to the actual solutions let's discuss iterative solutions.
         * Iterative Solution to Find Maximum Value in Map
         * In this program, we created a null Entry of Map type and then iterate over all the values of the map.
         * Whenever we get a bigger value or null value we assign it to Entry and at the end simply print the value of Entry.
         */
        Map.Entry<String, Integer> maxPrice = null;
        for (Map.Entry<String, Integer> price : coursePrice.entrySet()) {
            if (maxPrice == null || price.getValue().compareTo(maxPrice.getValue()) > 0) {
                maxPrice = price;
            }
        }
        System.out.println("Maximum price is: " + maxPrice.getValue());
    }
}
