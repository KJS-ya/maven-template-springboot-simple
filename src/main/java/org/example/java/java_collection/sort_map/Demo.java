package org.example.java.java_collection.sort_map;
/**
 * How to Sort a Java Map by Value
 * In this article, we will learn to sort elements of Java Map.
 * Map in java is unsorted by default and stores data in key-value format. It is very much required to sort them based on the values to make decisions based on values.
 *
 * Example: Sort a Map
 * Here, we are having an example of a Map of students with their names and heights in centimeters.
 * Let's say we want to sort students based on their names (programmatically based on keys) for that we will use Collections.sort() method,
 * the same method can be also used to sort students based on their heights (programmatically based on values) but the only change required is the comparator function.
 *
 * The Collections.sort() always take a List<T> as a parameter.
 * So, we will create a list from Map.entrySet() this method that will return all key-value pairs of the map.
 * Comparator function comes into play when sorting the particular set depends on multiple parameters.
 * Inside the comparator function, return student1.getKey().compareTo(student2.getKey()); decides the way of sorting.
 * In this case, it will sort based on keys.
 */

import java.util.*;
public class Demo
{
    public static void main(String args[])
    {
        Map<String,Integer> students = new HashMap<>();

        students.put("Student 1", 159);
        students.put("Student 2", 147);
        students.put("Student 3", 183);
        students.put("Student 4", 167);
        students.put("Student 5", 173);

        //将students.entrySet转换为List
        List<Map.Entry<String, Integer>> student_list = new ArrayList<>(students.entrySet());

        System.out.println("\nBefore Sorting\n");
        for(Map.Entry<String, Integer> student: student_list)
        {
            System.out.println(student.getKey()+" "+student.getValue());
        }

        //借助Collections工具类实现排序
        Collections.sort(student_list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare(Map.Entry<String, Integer> student1, Map.Entry<String, Integer> student2){
//                return student1.getKey().compareTo(student2.getKey());
                return student2.getKey().compareTo(student1.getKey());//实现降序改下student1和student2位置
                //< return -1 -1意味着不交换
                //> return 1 交换
                //= return 0 不交换
                //< return 1 > return -1  = return 0降序就是反过来，所有交换下a和b两个参数就行
            }
        });

        System.out.println("\nAfter Sorting\n");
        //遍历打印map中的值
        for(Map.Entry<String, Integer> student: student_list)
        {
            System.out.println(student.getKey()+" "+student.getValue());
        }

    }
}
