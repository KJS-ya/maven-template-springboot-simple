package org.example.java.java_arrays.initialize;

import java.util.Arrays;

public class Demo005 {
    public static void main(String[] args) {
        int[] intArr = {1,3,5,7,9};
        int[] copy1 = Arrays.copyOf(intArr,3);
        int[] copy2 = Arrays.copyOf(intArr,7);
        int[] copy3 = Arrays.copyOf(intArr,5);

        System.out.println("Original Array: " + Arrays.toString(intArr));
        System.out.println("Copied with smaller Array: " + Arrays.toString(copy1));
        System.out.println("Copied with bigger Array: " + Arrays.toString(copy2));
        System.out.println("Copied with same Array: " + Arrays.toString(copy3));
    }
}
