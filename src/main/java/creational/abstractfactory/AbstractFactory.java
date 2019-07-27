package creational.abstractfactory;

import creational.factory.Shape;

/**
 * @Author MCC
 * @Create 2019/7/27 15:02
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);
}
