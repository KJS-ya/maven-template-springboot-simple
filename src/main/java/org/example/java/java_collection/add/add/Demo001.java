package org.example.java.java_collection.add.add;

import java.util.Arrays;

/**
 * Arrays 类提供了一个简单的 copyOf（） 方法，该方法将元素从旧数组复制到新数组。
 * 此方法将旧数组和新数组的大小作为参数。让我们使用 copyOf（） 方法而不是 for 循环来重写上面的代码。
 */
public class Demo001 {
    public static int[] appendToArray(int[] oldArr,int elementToAdd){
        //creating a new array and copying the elements
        int[] newArr = Arrays.copyOf(oldArr,oldArr.length + 1);
        newArr[newArr.length-1]=elementToAdd;
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        arr = appendToArray(arr,7);
        arr = appendToArray(arr,8);
        arr = appendToArray(arr,9);
        System.out.println("After adding the element" + Arrays.toString(arr));
    }
}
