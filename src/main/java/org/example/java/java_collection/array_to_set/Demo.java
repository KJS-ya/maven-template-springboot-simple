package org.example.java.java_collection.array_to_set;

/**
 * 如何在Java中将数组转换为Set
 * 在这篇文章中，我们将使用Java co de将数组转换为set。数组是基于索引的数据结构，用于存储类似类型的数据，而集合是唯一元素的集合。
 *
 * 在这里，我们有几个将数组转换为set的示例，请始终记住该集合仅包含唯一元素，因此数组的重复元素在转换过程中不会添加到集合中。
 *
 * 在这里，我们使用 和 方法从数组元素进行设置。该方法是将数组元素添加到指定集合（列表，集合等）的类方法
 * addAll()asList()toSet()addAll()Collections
 *
 * 示例时间
 * 让我们举个例子，将数组转换为 Set。在这里，我们使用addAll（）方法将元素添加到集合中。这很容易从数组进行设置。
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Orange","Banana","Orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        Set<String> fruitsSet = new HashSet<>();
        Collections.addAll(fruitsSet,fruits);

        //我们可以使用方法将转换数组设置为 set。asList（） 方法返回数组的列表，该数组由构造函数进一步转换为集合。请参阅以下示例。asList()
//        Set<String> fruitsSet = new HashSet<>(Arrays.asList(fruits));

        //让我们创建另一个示例来从数组元素获取集合。在这里，我们使用从流元素返回 set 的 Collectors 类的方法。
        // 如果要使用流来获取 set 元素，则此示例很有用。toSet()
//        Set<String> fruitsSet = new HashSet<>();
//        fruitsSet = Arrays.stream(fruits).collect(Collectors.toSet());

        System.out.println(fruitsSet);
    }
}
