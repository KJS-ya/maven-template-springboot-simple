package org.example.java.java_collection.generics;

/**
 * 有界泛型方法
 * 泛型类和方法为用户提供了很多自由，但这有时可能对我们不利。我们可以使用 extends 关键字来限制泛型接受的类型范围。
 *
 * <T extends ClassName>
 * 这将只允许父类及其所有子类在泛型类或方法中。
 *
 * 例如，让我们创建三个类（ClassA、ClassB 和 ClassC），并从 ClassA 扩展 ClassB。
 * 然后，下面显示的 boundedPrint（） 方法将处理 ClassA 和 ClassB 的对象。
 */
class ClassA
{
    public void printClassA()
    {
        System.out.println("Class A");
    }
}

class ClassB extends ClassA
{
    public void printClassB()
    {
        System.out.println("Class B");
    }
}

class ClassC
{
    public void printClassC()
    {
        System.out.println("Class C");
    }
}

public class Demo001
{
    //Bounded Generic Method
    public static <T extends ClassA> void boundedPrint(T object)
    {
        System.out.println("Object of ClassA or a subclass of ClassA");
    }

    public static void main(String[] args)
    {
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        boundedPrint(a);
        boundedPrint(b);

        ClassC c = new ClassC();
//        boundedPrint(c);
    }
}
