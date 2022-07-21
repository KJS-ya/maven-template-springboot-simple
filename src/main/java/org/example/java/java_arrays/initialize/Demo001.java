package org.example.java.java_arrays.initialize;

/**
 * Arrays 类为我们提供了 fill（） 方法，该方法可用于用某些元素填充整个数组或数组的一部分。此方法无法初始化数组，它用于修改已初始化的数组。
 *
 * 如果我们使用以下签名，则数组的所有元素都将设置为 value 参数。
 *
 * public static void fill(int[] intArray, int value)
 * 相反，如果我们使用以下语法，则 fromIndex 和 toIndex（exclusive） 之间的所有元素都将设置为 value 参数。
 *
 * public static void fill(int[] intArray, int fromIndex, int toIndex, int value)
 * 下面的代码演示了 fill（） 方法的工作原理。我们也可以使用其他数据类型的数组。
 */
import java.util.Arrays;

public class Demo001
{
    public static void main(String[] args)
    {
        int[] intArray = new int[10]; //Array initialized with zeroes.
        System.out.println("Initial Array: " + Arrays.toString(intArray));
        Arrays.fill(intArray, -5);//Changing all the elements to -5
        System.out.println("Changing all elements of the array: " + Arrays.toString(intArray));

        int fromIdx = 1, toIdx = 5;
        Arrays.fill(intArray, fromIdx, toIdx, 0);//Changing some elements back to 0
        System.out.println("Changing a few elements of the array: " + Arrays.toString(intArray));
    }
}

