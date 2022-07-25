package org.example.java.java_collection.generics;

/**
 * Java 泛型方法
 * 就像类一样，Java中的方法也可以采用类型参数。这将使我们能够对不同的对象类型使用相同的方法。
 *
 * 请考虑下面的代码，它使用 Generic print（） 方法来打印对象。<T>在方法定义中告诉 Java 这是参数类型为 T 的泛型方法。
 * 我们可以在方法实现中的任何位置使用此类型 T。即使该方法返回 void，也必须使用菱形运算符。
 */
public class Demo {
    public static <T> void print(T object){
        System.out.println(object);
    }

    public static void main(String[] args) {
        String s = "100";
        Integer i = 100;
        Double d = 100.0;

        print(s);
        print(i);
        print(d);
    }
}
