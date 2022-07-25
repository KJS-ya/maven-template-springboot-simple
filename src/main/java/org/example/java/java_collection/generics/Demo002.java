package org.example.java.java_collection.generics;

/**
 * 我们还可以将有界泛型与实现接口的类一起使用。我们将使用带有 extends 关键字的接口名称，而不是类名。
 *
 * <T extends Interface>
 * 我们还可以同时使用类和接口来施加更严格的限制。
 *
 * <T extends Class & Interface>
 * 泛型中的类型安全
 * 使用泛型的一个主要优点是它提供了类型安全。如果我们为泛型定义了一个类型，那么编译器知道要期望什么对象，并在编译时返回错误，而不是给出运行时错误。
 *
 * 例如，如果我们创建一个 ArrayList 来存储整数，并且没有为其元素指定类型，则下面的代码将成功编译。但是我们将在运行时收到错误。
 */
public class Demo002 {
}
