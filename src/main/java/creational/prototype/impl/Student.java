package creational.prototype.impl;

import lombok.Data;

/**
 * @Author MCC
 * @Create 2019/7/27 17:29
 */
@Data
public class Student implements Cloneable {

    private String name;
    private Age age;
    private int length;

    public Student(String name, Age age, int length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    @Override
    public String toString() {
        return "姓名是： " + this.getName() + "， 年龄为： " + this.getAge().toString() + ", 长度是： " + this.getLength();
    }

    @Override
    public Object clone() {
        Object obj = null;
        //调用Object类的clone方法，返回一个Object实例
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //调用Age类的clone方法进行深拷贝
        //先将obj转化为学生类实例
        Student stu = (Student) obj;

        //这里是利用clone方法实现深度复制的关键所在，调用对象属性的clone方法完成深度复制
        //学生类实例的Age对象属性，调用其clone方法进行拷贝
        stu.age = (Age) stu.getAge().clone();

        return obj;
    }

}
