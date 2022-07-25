package org.example.java.java_collection.find_max_map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Example of finding Maximum Value in Map
 * Here, we simply passed all the values of Map using Map.values() and other stuff is automatically done by Collections class in Java.
 *
 * This example will print the maximum price of course present on the Map.
 */
public class Demo001 {
    public static void main(String[] args) {
//        Map<String,Integer> coursePrice = new HashMap<>();
//        coursePrice.put("Java",5000);
//        coursePrice.put("Python",3000);
//        coursePrice.put("CPP",4000);
//        coursePrice.put("Android",8000);
//        System.out.println("maximum price is: " + Collections.max(coursePrice.values()));
        /**
         * What if we want to find the maximum Map key instead of values?
         * In that case, we need to just pass the method Map.keySet() instead of Map.values(),
         * the code to implement for this case is given below where all the course prices are keys and course names are values.
         * So, we passed Map.keySet() in Collection.max() method.
         */
        Map<Integer,String> coursePrice = new HashMap<>();
        coursePrice.put(5000,"Java");
        coursePrice.put(3000,"Python");
        coursePrice.put(4000,"CPP");
        coursePrice.put(8000,"Android");
        System.out.println("maximum price is : "+ Collections.max(coursePrice.keySet()));
    }
}
