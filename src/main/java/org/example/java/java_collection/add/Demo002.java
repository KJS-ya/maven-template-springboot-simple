package org.example.java.java_collection.add;
/**
 * 追加到数组列表
 * 追加到 ArrayList 非常简单。此类附带一个 add（） 方法，该方法将元素添加到列表的末尾。下面的代码演示了这一点。
 */

import java.util.ArrayList;

public class Demo002 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        System.out.println("ArrayList: " + arrList);
    }
}
