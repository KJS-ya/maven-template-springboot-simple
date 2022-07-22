package org.example.java.java_collection.add.add;

import java.util.Arrays;

import static org.example.java.java_collection.add.add.AdeElement.Demo.appendToArray;

/**
 * 数组是 Java 中类似对象的固定大小集合。ArrayList 与数组非常相似，但没有大小限制。
 *
 * 在本教程中，我们将学习如何在数组和数组列表中插入元素。
 *
 * 数组和数组列表之间的区别
 * 在学习如何插入元素之前，让我们先快速了解一下数组和 ArrayList 之间的一些差异。
 *
 * 实现
 * 数组是由 Java 提供的简单线性数据结构。ArrayList 是 Java 中实现 List 接口的类，
 * 它是 Collections Framework 的一部分。ArrayList 在内部使用 Array 进行其操作。
 *
 * 访问和修改元素
 * 使用索引访问和修改数组的元素。ArrayList 类提供 getter 和 setter 方法来访问和修改其内容。
 *
 * 元素类型
 * 数组能够存储基本类型和非基本类型。数组列表只能存储非基本类型。但是，我们可以使用包装类来存储基本
 *
 * 大小
 * 如上所述，数组的大小是固定的，而 ArrayList 是动态大小的。对于数组，我们需要在实例化期间定义其大小。
 * 我们不能超过此大小限制。对于 ArrayLists，当我们需要向其添加更多元素时，大小会动态增加。将创建一个较大大小的新基础数组以容纳其他项。
 *
 * 追加元素
 * 让我们学习如何将元素追加到数组和 ArrayList。追加意味着添加到末尾。
 *
 * 追加到数组
 * 我们将首先创建一个较大大小的新数组。接下来，我们将元素传输到这个新数组。最后，我们可以在此新数组的末尾添加新项。下面的代码演示了这一点。
 */
public class AdeElement {
    public static class Demo{
        public static int[] appendToArray(int[] arr,int elementToAdd){
            int[] newArr = new int[arr.length+1];//new array of larger size
            //copying elements from old to new array
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[newArr.length - 1] = elementToAdd;
            return newArr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        arr = appendToArray(arr,7);
        arr = appendToArray(arr,8);
        arr = appendToArray(arr,9);
        System.out.println("after adding the elements: " + Arrays.toString(arr));
    }
}
