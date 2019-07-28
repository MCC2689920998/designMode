package structural.decorator.impl;

import structural.decorator.Shape;
import structural.decorator.ShapeDecorator;

/**
 * @Author MCC
 * @Create 2019/7/28 9:01
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
}
