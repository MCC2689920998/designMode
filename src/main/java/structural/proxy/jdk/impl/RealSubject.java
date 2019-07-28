package structural.proxy.jdk.impl;

import structural.proxy.jdk.Subject;

/**
 * @Author MCC
 * @Create 2019/7/28 10:59
 */
public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
