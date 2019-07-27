package creational.builder.impl;

/**
 * @Author MCC
 * @Create 2019/7/27 16:22
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
