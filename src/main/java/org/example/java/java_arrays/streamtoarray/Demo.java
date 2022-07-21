package org.example.java.java_arrays.streamtoarray;

/**
 * 在这篇文章中，我们将学习将流转换为数组。流是一系列元素，它允许我们在函数方法中执行操作，而数组是存储类似类型元素的对象。
 *
 * 在这里，我们有一些示例，其中我们将流转换为基元值数组。
 *
 * 让我们创建一个示例将流转换为数组。在这里，我们使用方法创建一个整数序列，然后使用方法转换为数组。rangeClosed()IntStreamtoArray()
 */

import java.util.stream.IntStream;
public class Demo {
    public static void main(String[] args){
        IntStream integerStream = IntStream.rangeClosed(1, 5);
        // Convert stream into Array
        int[] arr = integerStream.toArray();
        for(int e:arr) {
            System.out.println(e);
        }
    }
}
