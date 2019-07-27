package creational.builder.impl;

import creational.builder.Packing;

/**
 * @Author MCC
 * @Create 2019/7/27 16:17
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
