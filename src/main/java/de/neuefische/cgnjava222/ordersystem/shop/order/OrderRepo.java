package de.neuefische.cgnjava222.ordersystem.shop.order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepo {

    private final Map<Integer, Order> orders = new HashMap<>();

    public void addOrder(Order order) {
        orders.put(order.id(), order);
    }

    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }
}
