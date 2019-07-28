package structural.facade.impl;


import structural.facade.Shape;

/**
 * @Author MCC
 * @Create 2019/7/28 8:59
 */
public class Square implements Shape {


    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
