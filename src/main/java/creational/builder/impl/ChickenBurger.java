package creational.builder.impl;

/**
 * @Author MCC
 * @Create 2019/7/27 16:21
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
