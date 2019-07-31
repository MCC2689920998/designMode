package behavioral.command;

import behavioral.command.impl.BuyStock;
import behavioral.command.impl.SellStock;
import org.junit.Test;

public class OrderTest {

    @Test
    public void execute() throws Exception {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();

    }

}