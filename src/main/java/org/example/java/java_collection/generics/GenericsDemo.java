package org.example.java.java_collection.generics;

/**
 * Java Generics
 * 泛型意味着不具体或固定的东西。在 Java 中，创建泛型类和方法是为了处理不同的数据类型和对象。
 *
 * 我们只是为类或方法可以接受的类型创建一个参数。泛型提供了一个额外的抽象层，并帮助我们避免运行时错误。
 * 它们还提供类型安全性。让我们进一步了解 Java 中的泛型。
 *
 * Java 泛型类
 * 假设，我们需要一个可以与任何对象类型一起使用的类。我们可以使用菱形运算符（<>）在Java中创建一个泛型类。
 *
 * 请考虑下面显示的示例。菱形运算符之间的字母 T 称为类型参数。可以使用 String type、Integer type 甚至 Double 来创建类对象。
 * @param <T>
 */
//Generic class with parameter type T
class GenericClass<T>
{
    T field1;//Object of type T
    GenericClass(T f1)
    {
        this.field1 = f1;
    }
}

public class GenericsDemo
{
    public static void main(String[] args)
    {
        GenericClass<String> g1 = new GenericClass("100");
        GenericClass<Integer> g2 = new GenericClass(100);
        GenericClass<Double> g3 = new GenericClass(100.0);
    }
}