package org.example.java.java_arrays.initialize;

import java.util.Arrays;

/**
 * 现在，让我们尝试初始化字符串数组。如果元素的索引小于 5，则其值应< 5，否则应具有值 >=5。
 */
public class Demo003
{
    public static void main(String[] args)
    {
        //Declaring array
        String[] strArray;

        strArray = new String[10];
        //Initializing using setAll()
        Arrays.setAll(strArray, (index) -> ((index < 5) ? "<5" : ">=5" ));

        //Printing the values
        for(int i = 0; i < strArray.length; i++)
            System.out.println("Index: " + i + " Value: " + strArray[i]);
    }
}

