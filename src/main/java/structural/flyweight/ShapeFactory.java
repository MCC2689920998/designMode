package structural.flyweight;

import structural.flyweight.impl.Circle;

import java.util.HashMap;

/**
 * @Author MCC
 * @Create 2019/7/28 10:37
 * 创建一个工厂，生成基于给定信息的实体类的对象。
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
