package creational.prototype.impl;

import lombok.Data;

/**
 * @Author MCC
 * @Create 2019/7/27 17:26
 */
@Data
public class Age implements Cloneable {

    private int age;

    public Age(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.age + "";
    }

    //重写Object的clone方法
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
