package org.example.java.java_collection.string_to_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 如何在Java中将字符串转换为数组列表
 * 在这篇文章中，我们将把一个字符串转换为arraylist使用Java代码实现。该字符串是 Java 中的字符序列和类，而ArrayList是列表接口的实现类。
 *
 * 假设我们有一个 URL 字符串，它由服务器资源路径组成，并由一些单独的符号分隔，我们希望将其获取为 ArrayList.因此，我们需要执行此转换。
 *
 * 要将字符串转换为ArrayList，我们使用 asList(),split()和 add()方法。asList()该方法属于Arrays该类，并从数组返回一个列表。
 *
 * split()该方法属于String该类，并返回基于指定的拆分分隔符的数组。
 *
 * 在这里，我们有几个示例来说明字符串到ArrayList转换的过程。请参阅下面的示例。
 *
 * 示例时间：
 * 让我们举个例子，从字符串中获取数组列表。在这里，我们使用 split（） 方法来获取字符串数组，然后使用 asList（） 方法将此数组转换为列表。
 */
public class Demo {
    public static void main(String[] args) {
        String msg = "StudyTonight.com/tutorial/java/string";
        System.out.println(msg);
        //string to arraylist
        ArrayList<String> list = new ArrayList<>(Arrays.asList(msg.split("/")));
        list.forEach(System.out::println);
    }
}
