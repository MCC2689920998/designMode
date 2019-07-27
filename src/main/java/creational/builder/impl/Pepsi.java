package creational.builder.impl;

/**
 * @Author MCC
 * @Create 2019/7/27 16:22
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
