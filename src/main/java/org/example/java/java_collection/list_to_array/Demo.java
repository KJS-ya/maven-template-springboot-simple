package org.example.java.java_collection.list_to_array;

import java.util.ArrayList;
import java.util.List;

/**
 * 如何在Java中将列表转换为数组
 * 在这篇文章中，我们将使用Java代码将List转换为数组。列表是用于存储数据的线性数据结构，而数组是基于索引的数据结构，用于存储类似类型的数据。
 *
 * 要将 List 转换为数组，我们使用返回对象数组的 List 接口的方法。toArray()
 *
 * 我们使用几个示例将列表转换为具有旧方法和新方法（如流和方法引用）的数组。
 *
 * 示例时间：
 * 在此示例中，我们将创建一个水果列表并打印其元素。之后，我们使用 toArray（） 方法将列表转换为数组。
 * toArray（） 方法返回对象元素的数组。因此，如果要获取另一种类型的数组，则将该类型的对象作为参数传递。
 */
public class Demo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        System.out.println(fruits);
        //Conversion list to array
        String[] newArray = new String[0];
        newArray = fruits.toArray(newArray);
        System.out.println(newArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
