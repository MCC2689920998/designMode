package creational.abstractfactory.impl;

import creational.abstractfactory.Color;

/**
 * @Author MCC
 * @Create 2019/7/27 15:01
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
