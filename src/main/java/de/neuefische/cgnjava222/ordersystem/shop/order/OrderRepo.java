package de.neuefische.cgnjava222.ordersystem.shop.order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
}
