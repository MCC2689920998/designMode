package creational.factory.impl;

import creational.factory.Shape;

/**
 * @Author MCC
 * @Create 2019/7/27 14:38
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
