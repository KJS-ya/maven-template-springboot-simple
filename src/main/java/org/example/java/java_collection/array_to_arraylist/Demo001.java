package org.example.java.java_collection.array_to_arraylist;

/**
 * Example: Creating an ArrayList from an Array using Arrays.asList() method.
 * In this example asList() method from an Arrays class will convert the given array to an ArrayList.
 */
import java.util.*;
public class Demo001
{
    public static void main(String[] args)
    {

        String courses[]={"Java", "Python", "Android", "Web"};
        ArrayList<String> courseList= new ArrayList<String>(Arrays.asList(courses));
        for (String course: courseList)
        {
            System.out.println(course);
        }
    }
}
