package creational.abstractfactory;

import creational.abstractfactory.impl.Blue;
import creational.abstractfactory.impl.Green;
import creational.abstractfactory.impl.Red;
import creational.factory.Shape;

/**
 * @Author MCC
 * @Create 2019/7/27 15:05
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if ("RED".equalsIgnoreCase(colorType)) {
            return new Red();
        } else if ("GREEN".equalsIgnoreCase(colorType)) {
            return new Green();
        } else if ("BLUE".equalsIgnoreCase(colorType)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
