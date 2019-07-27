package creational.Prototype;

import creational.Prototype.impl.Age;
import creational.Prototype.impl.Student;

/**
 * @Author MCC
 * @Create 2019/7/27 17:06
 * 浅复制 Java中针对基本数据类型的成员变量，在浅复制的时候是完全复制一份给新对象。针对引用数据类型的变量而是直接拷贝引用，
 * 这样两个对象其实操作的是同一个对象。
 * 深复制
 * 深复制就是相对浅复制而言，针对引用类型的属性进行完全的拷贝，而不仅仅只是将引用地址进行复制。
 * 完成深复制一般有两种方式：一种是在复写clone方法的时候，调用引用对象的clone方法，另一种是利用序列化操作完成
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Age a = new Age(20);
        Student stu1 = new Student("TestMan", a, 175);
        System.out.println(stu1.toString());

        //通过调用重写后的clone方法进行浅拷贝
        Student stu2 = (Student) stu1.clone();
        System.out.println(stu2.toString());

        //尝试修改stu1中的各属性，观察stu2的属性有没有变化
        stu1.setName("大傻子");
        //改变age这个引用类型的成员变量的值
        a.setAge(88);
        //使用这种方式修改age属性值的话，stu2是不会跟着改变的。因为创建了一个新的Age类对象而不是改变原对象的实例值
        //stu1.setAge(new Age(21));
        stu1.setLength(216);
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

    }
}
