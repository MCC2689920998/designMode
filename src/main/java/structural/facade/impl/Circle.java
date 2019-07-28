package structural.facade.impl;

import structural.facade.Shape;

/**
 * @Author MCC
 * @Create 2019/7/28 9:27
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
