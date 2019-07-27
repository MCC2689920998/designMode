package creational.factory.impl;

import creational.factory.Shape;

/**
 * @Author MCC
 * @Create 2019/7/27 14:44
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
