package structural.bridge.impl;

import structural.bridge.DrawAPI;

/**
 * @Author MCC
 * @Create 2019/7/27 19:51
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
