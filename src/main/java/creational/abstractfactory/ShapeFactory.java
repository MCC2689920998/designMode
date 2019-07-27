package creational.abstractfactory;

import creational.factory.Shape;
import creational.factory.impl.Circle;
import creational.factory.impl.Rectangle;
import creational.factory.impl.Square;

/**
 * @Author MCC
 * @Create 2019/7/27 15:03
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
