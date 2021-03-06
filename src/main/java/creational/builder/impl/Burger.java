package creational.builder.impl;

import creational.builder.Item;
import creational.builder.Packing;

/**
 * @Author MCC
 * @Create 2019/7/27 16:18
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
