package creational.builder;

import creational.builder.impl.ChickenBurger;
import creational.builder.impl.Coke;
import creational.builder.impl.Pepsi;
import creational.builder.impl.VegBurger;

/**
 * @Author MCC
 * @Create 2019/7/27 16:24
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
