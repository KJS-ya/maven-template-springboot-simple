package org.example.java.java_collection.add;

import java.util.ArrayList;

/**
 * 插入数组列表
 * add（） 方法有一个重载版本，该版本还采用我们要添加元素的索引。这些项目将从一个位置移动到右侧，以便为新项目腾出空间。
 */
public class Demo004
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        System.out.println("Initial ArrayList: " + arrList);
        arrList.add(1, 50);
        System.out.print("After adding 50 at index 1: " + arrList);
    }
}