package org.example.java.java_collection.add;

import java.util.Arrays;

public class Demo003
{
    public static int[] insertAtIndex(int[] arr, int elementToAdd, int index)
    {
        int[] newArr = new int[arr.length + 1];//new array of larger size
        //Copying and adding the new element
        int currIdx = 0;
        for(int i = 0; i < newArr.length; i++)
        {
            if(i == index)
                newArr[i] = elementToAdd;
            else {
                newArr[i] = arr[currIdx];
                currIdx += 1;
            }
        }
        return newArr;
    }
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        arr = insertAtIndex(arr, 50, 1);
        System.out.println("After adding 50 at index 1: " + Arrays.toString(arr));
    }
}