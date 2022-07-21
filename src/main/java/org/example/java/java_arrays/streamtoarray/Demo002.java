package org.example.java.java_arrays.streamtoarray;

import java.util.stream.Stream;

/**
 * 在这篇文章中，我们将学习如何使用Java代码将多个数组连接成一个数组。当我们需要将两个或多个数组的数据合并到单个数组中时，可能会出现这种情况，例如将两个源合并为一个以将数据作为单个源进行传输。
 *
 * 在这里，我们使用 Java 8 流 API 来连接数组，并以数组或流的形式获得结果。请参阅此处给出的示例。
 *
 * 让我们举个例子，将两个字符串数组联接到一个字符串数组中。
 * 在这里，我们使用的方法返回一个流序列，该流序列通过使用该方法进一步转换为数组。of()StreamtoArray()
 */
public class Demo002 {
    public static void main(String[] args) {
        String[] asia = new String[]{"India","Russia","Japan"};
        String[] europe = new String[]{"Poland","Germany","France"};

        //join arrays
        String[] countries = Stream.of(asia,europe).flatMap(Stream::of).toArray(String[]::new);
        for (String country:countries ) {
            System.out.println(country);
        }
    }
}
