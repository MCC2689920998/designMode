package creational.builder.impl;

/**
 * @Author MCC
 * @Create 2019/7/27 16:20
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
