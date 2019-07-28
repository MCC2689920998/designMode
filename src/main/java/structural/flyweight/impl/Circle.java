package structural.flyweight.impl;

import lombok.Data;
import structural.flyweight.Shape;

/**
 * @Author MCC
 * @Create 2019/7/28 10:36
 */
@Data
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
