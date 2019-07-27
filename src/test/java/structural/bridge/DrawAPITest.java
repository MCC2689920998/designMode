package structural.bridge;

import org.junit.Test;
import structural.bridge.impl.Circle;
import structural.bridge.impl.GreenCircle;
import structural.bridge.impl.RedCircle;

import static org.junit.Assert.*;

public class DrawAPITest {
    @Test
    public void drawCircle() throws Exception {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}