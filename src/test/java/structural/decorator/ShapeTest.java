package structural.decorator;

import org.junit.Test;
import structural.decorator.impl.Circle;
import structural.decorator.impl.Rectangle;
import structural.decorator.impl.RedShapeDecorator;

import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void draw() throws Exception {

        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}