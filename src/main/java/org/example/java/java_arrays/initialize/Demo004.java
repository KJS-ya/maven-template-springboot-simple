package org.example.java.java_arrays.initialize;

/**
 * 使用 ArrayUtils.clone（） 方法
 * 我们可以使用 clone（） 方法通过复制或克隆另一个数组来初始化一个数组。这仅用于创建现有阵列的副本。它是Apache Commons Lang 3软件包的一部分。
 */

import org.apache.commons.lang3.ArrayUtils;

public class Demo004
{
    public static void main(String[] args)
    {
        int[] intArray = {1, 3, 5, 7, 9};
        int[] copy = ArrayUtils.clone(intArray);

        for(int i = 0; i < copy.length; i++)
            System.out.println(copy[i]);
    }
}
