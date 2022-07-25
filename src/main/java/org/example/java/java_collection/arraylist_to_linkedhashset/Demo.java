package org.example.java.java_collection.arraylist_to_linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * 在这篇文章中，我们将把ArrayList转换为LinkedHashSet。LinkedHashSet是一个使用linkedlist数据结构来实现Java中的Set的类。
 *
 * 当我们想要将类似数组的列表转换为唯一的数据集合时，这很有用。LinkedHashSet用于收集唯一数据。
 *
 * 要将ArrayList转换为LinkedHashSet，我们使用各种方式，如stream API或add（）方法或LinkedHashSet构造函数。请参阅以下示例。
 *
 * 示例时间：
 * 在此示例中，我们使用流 API 将 ArrayList 元素收集到 LinkedHashSet 中，以获取唯一元素。请参阅下面的示例。
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mango");
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Apple");
        System.out.println(arrList);
        //arraylist to linkedhashset
        LinkedHashSet<String> linkList = arrList.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Linked HashSet: ");
        System.out.println(linkList);
    }
}
