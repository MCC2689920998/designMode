package structural.bridge.impl;

import structural.bridge.DrawAPI;
import structural.bridge.Shape;

/**
 * @Author MCC
 * @Create 2019/7/27 19:52
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
