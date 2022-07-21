package org.example.java.java_arrays.arraytoarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * 让我们再举一个例子来理解数组到 ArrayList 的转换。
 * 在这里，我们使用addAll（）方法将所有数组元素添加到ArrayList中。请参阅下面的示例。
 */
public class Demo {
    public static void main(String[] args) {
        String[] fruits = new String[]{"Apple","Orange","Banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        ArrayList<String> arrayList= new ArrayList<String>();
        Collections.addAll(arrayList,fruits);
        System.out.println(arrayList);
    }
}
