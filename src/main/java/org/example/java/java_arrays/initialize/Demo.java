package org.example.java.java_arrays.initialize;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Declaring array
        int[] intArray;
        //Defining the array length
        intArray = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entering the values: ");
        //Initializing
        for (int i = 0; i < intArray.length; i++)
            intArray[i] = scanner.nextInt();
        scanner.close();

        System.out.println("The array contains: ");
        //Printing the values
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
