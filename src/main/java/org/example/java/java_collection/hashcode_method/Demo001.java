package org.example.java.java_collection.hashcode_method;

/**
 * 哈希码（） 方法
 * 如上所述，hashCode（） 方法为给定的输入返回一个整数值。不同的IDE有自己的hashCode（）方法的实现，我们可以直接使用它们或覆盖它们。
 * 任何 hashCode（） 方法都应满足以下三个条件。这些条件一起也称为哈希代码协定。
 *
 * hashCode（） 方法每次都必须为特定对象返回相同的值，因为我们没有更改 hashCode（） 方法或 equals（） 方法的实现，并且不会以任何方式修改对象。
 * 如果 equals（） 方法对两个对象返回 true，则 hashCode（） 方法必须为这两个对象返回相同的哈希值。
 * hashCode（） 可以为两个根据 equals（） 方法不相等的对象返回相同的哈希值。
 * 即使hashCode（）方法在为不同的输入返回相同的哈希值时是完全有效的，但是当在哈希表的实现中使用此方法时，它会导致很多冲突。
 * 在这种情况下，哈希表的查找时间将不是常量 （O（1））。有一些方法可以处理这些碰撞，如探测和链接，但避免它们是更好的选择。
 * 避免冲突的最佳方法是编写一个强 hashCode（） 方法。
 *
 * 内置哈希代码（）方法的示例
 * 下面的代码演示了 Eclipse IDE 的内置 hashCode（） 方法的工作原理。
 */
public class Demo001 {
    public static void main(String[] args) {
        String str1 = "String 1";
        String str2 = "String 1";
        String str3 = "String 3";

        System.out.println("Hash of str1: " + str1.hashCode());
        System.out.println("Hash of str2: " + str2.hashCode());
        System.out.println("String 1 is equals to String 2: " + str1.equals(str2));
        System.out.println("Hash of str3: " + str3.hashCode());
        System.out.println("String 1 is equals to String 3" + str1.equals(str3));
    }
}
