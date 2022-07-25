package org.example.java.java_collection.initialization;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 使用 Java 8 流
 * 流还可以在 Java 中初始化列表。我们可以使用 Stream.of（） 方法来创建一个 Stream。
 * 接下来，我们将使用 collect（） 方法收集 List 中的流元素。
 */
public class Demo004 {
    public static void main(String[] args) {
        List<String> listOfString = Stream.of("Jessica","Justin","Simon").
                collect(Collectors.toList());
        System.out.println(listOfString);
    }
}
