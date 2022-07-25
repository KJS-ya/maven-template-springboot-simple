package org.example.java.java_collection.hashcode_method;

/**
 * Demo002的hashCode（）方法是完全有效的，因为它满足合同的所有条件，但它不是很强，
 * 因为具有相同名字第一个字母的不同学生将被分配相同的哈希值。让我们使用类的其他字段来编写更强的 hashCode（） 方法。
 */
class Student1
{
    String name;
    int regNo;
    double gpa;

    Student1(String name, int regNo, double gpa)
    {
        this.name = name;
        this.regNo = regNo;
        this.gpa = gpa;
    }

    @Override
    public int hashCode()
    {
//        return ((int)this.name.charAt(0) - 64) * this.regNo * (int)this.gpa;

        //上面的 hashCode（） 方法比前一个方法更好。现在，让我们在 hashCode（） 方法的实现中使用内置的 hashCode（） 方法。
        return this.name.hashCode() * this.regNo * (int)this.gpa;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(obj.getClass() != this.getClass())
            return false;
        Student1 s = (Student1)obj;
        return this.name == s.name &&
                this.regNo == s.regNo &&
                this.gpa == s.gpa;
    }
}


public class Demo003
{
    public static void main(String args[])
    {
        Student1 s1 = new Student1("Justin", 59, 7.6);
        Student1 s2 = new Student1("Jessica", 21, 8.0);
        Student1 s3 = new Student1("Paul", 20, 5.5);
        Student1 s4 = new Student1("Justin", 59, 7.6);

        System.out.println("Hash of s1: " + s1.hashCode());
        System.out.println("Hash of s2: " + s2.hashCode());
        System.out.println("Hash of s3: " + s3.hashCode());
        System.out.println("Hash of s4: " + s4.hashCode());

        System.out.println("s1 is the same as s2: " + s1.equals(s2));
        System.out.println("s1 is the same as s4: " + s1.equals(s4));

    }
}
