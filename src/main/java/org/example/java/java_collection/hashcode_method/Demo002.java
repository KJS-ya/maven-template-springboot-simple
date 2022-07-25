package org.example.java.java_collection.hashcode_method;

/**
 * 哈希表的工作原理
 * 哈希表是一种数据结构，它根据数据的哈希值将数据存储在不同的存储桶中。
 * 这样，当我们需要搜索元素时，我们可以直接转到该特定存储桶，而无需搜索每个存储桶。哈希表的基本工作原理总结如下。
 *
 * 添加元素时，将使用 hashCode（） 函数生成其哈希值。
 * 此哈希值确定应在其中添加元素的存储桶。如果 hashCode（） 方法不是很强，并且为不同的元素生成了重复的值，则单个存储桶中将存在多个元素。
 * 搜索元素时，首先为元素生成 hashCode（），然后我们直接在存储桶中搜索它应该存在的位置。
 * 如果存储桶中存在多个对象，则可以使用 equals（） 方法在存储桶中搜索正确的元素。
 * 示例：实现 hashCode（） 方法
 * 让我们尝试创建一个学生类并实现我们自己的hashCode（）和equals（）方法。
 * 首先，我们将实现一个基本的hashCode（）方法，该方法仅根据学生姓名的第一个字母返回一个整数。
 */
class  Student{
        String name;
        int regNo;
        double gpa;

        Student(String name,int regNo,double gpa){
            this.name=name;
            this.regNo=regNo;
            this.gpa=gpa;
        }
        @Override
        public int hashCode(){
            return (int)this.name.charAt(0)-64;
        }

        @Override
        public boolean equals(Object object){
            if(object == null)
                return false;
            if(this==object)
                return true;
            if(object.getClass()!=this.getClass())
                return false;
            Student s = (Student) object;
            return this.name == s.name&&
                    this.regNo == s.regNo&&
                    this.gpa == s.gpa;
        }
}

public class Demo002 {
    public static void main(String[] args) {
        Student s1 = new Student("Justin",59,7.6);
        Student s2 = new Student("Jessica",21,8.0);
        Student s3 = new Student("Paul",20,5.5);
        Student s4 = new Student("Justin",59,7.6);

        System.out.println("Hash of s1: " + s1.hashCode());
        System.out.println("Hash of s2: " + s2.hashCode());
        System.out.println("Hash of s3: " + s3.hashCode());

        System.out.println("s1 is the same as s2: " + s1.equals(s2));
        System.out.println("s1 is the same as s4: " + s1.equals(s4));
    }
}
