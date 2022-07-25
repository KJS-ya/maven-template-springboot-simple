package org.example.java.java_collection.sort_map;

/**
 * Example of Sorting a Map, Based on Values
 * To sort the Map based on values we need to simply change the comparator function student1.getValue().compareTo(student2.getValue()); and the rest code will be the same.
 *
 * enlightened Here, the comparator function is dealing with values of Map, and therefore we will get the result based on values.
 */
import java.util.*;
public class Demo001
{
    public static void main(String args[])
    {
        Map<String,Integer> students = new HashMap<>();

        students.put("Student 1", 159);
        students.put("Student 2", 147);
        students.put("Student 3", 183);
        students.put("Student 4", 167);
        students.put("Student 5", 173);

        List<Map.Entry<String, Integer>> student_list = new ArrayList<>(students.entrySet());

        System.out.println("\nBefore Sorting\n");
        for(Map.Entry<String, Integer> student: student_list)
        {
            System.out.println(student.getKey()+" "+student.getValue());
        }

        Collections.sort(student_list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> student1, Map.Entry<String, Integer> student2){
                return student1.getValue().compareTo(student2.getValue());
            }
        });

        System.out.println("\nAfter Sorting\n");
        for(Map.Entry<String, Integer> student: student_list)
        {
            System.out.println(student.getKey()+" "+student.getValue());
        }

    }
}