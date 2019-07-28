package structural.facade;

import structural.facade.impl.Circle;
import structural.facade.impl.Rectangle;
import structural.facade.impl.Square;

/**
 * @Author MCC
 * @Create 2019/7/28 9:27
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
