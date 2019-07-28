package structural.facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeMakerTest {
    @Test
    public void drawCircle() throws Exception {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }

}