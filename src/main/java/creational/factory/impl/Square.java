package creational.factory.impl;

import creational.factory.Shape;

/**
 * @Author MCC
 * @Create 2019/7/27 14:43
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
