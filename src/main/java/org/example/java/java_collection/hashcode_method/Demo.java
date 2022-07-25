package org.example.java.java_collection.hashcode_method;

/**
 * 散列是为给定键生成唯一值的技术。哈希用于实现哈希表，这些数据结构提供了一种更快、更有效的方法来查找数据。
 * 哈希被许多不同的集合使用，如HashMap和HashSet。hashCode（） 方法为给定键返回一个整数值（也称为哈希值或哈希值）。
 *
 * Java equals（） Method
 * 在继续之前，我们必须了解 equals（） 方法。equals（） 方法是一个简单的方法，如果被比较的两个对象相等，则返回 true，否则返回 false。
 *
 * equals（） 方法主要由数据结构用于检查数据结构中是否存在值。这是通过将键与数据结构中存在的所有元素进行比较来完成的。
 * HashCode（） 方法通常是对具有 equals（） 方法的类的补充。添加 hashCode（） 方法以减少 equals（） 方法完成的比较次数。
 * 如果 equals（） 方法发生更改，则相应的 hashCode（） 方法也应更改。
 * 例如，考虑一个具有学生姓名和 GPA 的学生班级。如果我们说两个学生是相等的，如果只是他们的名字是相同的，
 * 那么HashCode（）方法也应该以这样的方式编写，即它只关注学生的名字。
 * 基本上，hashCode（） 不应该考虑 equals（） 方法未用于相等性检查的任何字段。
 * equals（） 方法的示例如下所示。
 */
public class Demo {
    public static void main(String[] args) {
        String str1 = "String 1";
        String str2 = "String 2";
        String str3 = "String 1";

        System.out.println("str1 is equals to str2: " + str1.equals(str2));
        System.out.println("str1 is equals to str3: " + str1.equals(str3));
    }
}
