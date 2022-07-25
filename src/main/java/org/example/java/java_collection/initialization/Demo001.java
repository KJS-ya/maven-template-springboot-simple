package org.example.java.java_collection.initialization;

import java.util.Arrays;
import java.util.List;

/**
 * 单行列表初始化
 * List是Java中的一个接口，由ArrayList和LinkedList等类实现。List 接口实现集合接口。
 *
 * 在本教程中，我们将学习一些在Java中初始化List的单行代码。
 *
 * Arrays.asList（） Method
 * 我们可以使用 asList（） 方法从数组创建 List。此方法可以采用 varargs，因此我们甚至不需要数组来初始化列表。我们可以直接将元素传递给此方法。
 */
public class Demo001 {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Justin","Jessica","Simon","Harry");
        System.out.println(listOfString);
    }
}
