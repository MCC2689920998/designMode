package structural.facade.impl;


import structural.facade.Shape;

/**
 * @Author MCC
 * @Create 2019/7/28 8:59
 */
public class Rectangle implements Shape {


    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
