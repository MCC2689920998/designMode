package behavioral.command;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author MCC
 * @Create 2019/7/31 9:10
 */
public class Broker {
    private List<Order> orderList = Lists.newArrayList();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
