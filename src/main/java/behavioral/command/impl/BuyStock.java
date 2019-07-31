package behavioral.command.impl;

import behavioral.command.Order;
import behavioral.command.Stock;

/**
 * @Author MCC
 * @Create 2019/7/31 9:09
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
