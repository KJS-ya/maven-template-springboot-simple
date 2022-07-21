package org.example.java.java_arrays.streamtoarray;

import java.util.stream.Stream;

/**
 * 我们可以通过使用返回指定类型的流的 concat（） 方法组合两个流。
 * 该示例解释了如何将两个或多个流连接到单个流中，就像我们在上面的示例中所做的那样，以组合两个数组。
 */
public class Demo003 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(4,5,6);
        //concat arrays
        Stream<Integer> result = Stream.concat(stream1,stream2);
        result.forEach(System.out::print);
    }
}
