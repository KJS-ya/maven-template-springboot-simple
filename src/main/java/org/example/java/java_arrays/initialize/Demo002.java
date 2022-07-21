package org.example.java.java_arrays.initialize;

/**
 * Using Arrays.setAll（） Method
 * Arrays 类的 setAll（） 方法可用于在生成器函数的帮助下初始化数组。此生成器函数使用索引计算数组值。
 *
 * 例如，让我们尝试使用前 10 个自然数的平方初始化数组。
 */

import java.util.Arrays;

public class Demo002
{
    public static void main(String[] args)
    {
        //Declaring array
        int[] intArray;

        intArray = new int[10];
        //Initializing using setAll()
        Arrays.setAll(intArray, (index) -> (index+1) * (index+1) );

        //Printing the values
        for(int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);
    }
}

