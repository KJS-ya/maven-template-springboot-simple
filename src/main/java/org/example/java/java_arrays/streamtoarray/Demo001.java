package org.example.java.java_arrays.streamtoarray;

/**
 * 让我们再举一个例子，从流中获取数组。在这里，我们从列表创建了一个流，并通过指定数组类型来转换 using 方法。
 * 另一方面，我们还将数组转换为流，以便我们可以在需要时获取以前类型的元素。toArray()
 */
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//public class Demo001 {
//    public static void main(String[] args){
//        Stream<String> stream = List.of("UK", "US", "BR").stream();
//        // Convert string stream into string array
//        String[] strArray = stream.toArray(String[]::new);
//        for(String str : strArray) {
//            System.out.println(str);
//        }
//        System.out.println("\nAfter conversion to array:");
//        // Array to stream conversion
//        Stream<String> stringStream = Arrays.stream(strArray);
//        stringStream.forEach(System.out::println);
//
//    }
//}
