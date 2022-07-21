package org.example.java.java_arrays.return_array_from_method;

/**
 * 在本文中，我们将学习如何在Java中返回数组。在本教程结束时，您将学习如何在 Java 方法中传递数组，如何在方法内部对它们执行操作，
 * 最后学习如何从 Java 方法返回数组。
 *
 * 在 Java 中返回数组的程序
 * 在下面给出的程序中，我们创建了一个方法，该方法将返回一个分配到的数组，该数组在方法调用语句中声明，
 * 最后，将打印该数组。要返回数组，函数的返回类型必须是数组类型。public static int[] getArray()arr arr int[] arr = getArray();
 *
 */
public class StudyTonight
{
    public static void main(String args[])
    {
        int[] arr=getArray();
        for (int i = 0; i < arr.length; i++)
            System.out.print( arr[i]+ " ");
    }
    public static int[] getArray()
    {
        int[] arr={17,18,19,20,21};
        return arr;
    }
}
