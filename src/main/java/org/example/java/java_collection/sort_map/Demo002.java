package org.example.java.java_collection.sort_map;

import java.util.*;

/**
 * Example of Sorting Map Using lambda and Based on Values
 * This method is also very much similar to what we did in the first example.
 * But, the only difference is in the comparator function which is known as anonymous implementation即匿名实现 (student1, student2)->student1.getKey().compareTo(student2.getKey()));
 */
public class Demo002 {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();

        students.put("Student 1",159);
        students.put("Student 2", 147);
        students.put("Student 3", 183);
        students.put("Student 4", 167);
        students.put("Student 5", 173);

        List<Map.Entry<String,Integer>> student_list = new ArrayList<>(students.entrySet());

        System.out.println("\nBefore Sorting\n");
        for (Map.Entry<String, Integer> student : student_list) {
            System.out.println(student.getKey() + " " + student.getValue());
        }

        Collections.sort(student_list,(student1,student2)->student1.getKey().compareTo(student2.getKey()));

        System.out.println("\nAfter Sorting\n");
        for(Map.Entry<String, Integer> student: student_list)
        {
            System.out.println(student.getKey()+" "+student.getValue());
        }
    }
}
