package creational.builder.impl;

import creational.builder.Packing;

/**
 * @Author MCC
 * @Create 2019/7/27 16:16
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
