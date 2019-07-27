package structural.bridge;

/**
 * @Author MCC
 * @Create 2019/7/27 19:52
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
