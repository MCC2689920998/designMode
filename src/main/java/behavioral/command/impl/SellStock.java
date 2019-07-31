package behavioral.command.impl;

import behavioral.command.Order;
import behavioral.command.Stock;

/**
 * @Author MCC
 * @Create 2019/7/31 9:46
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
