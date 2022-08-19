package de.neuefische.cgnjava222.ordersystem.shop.order;

import de.neuefische.cgnjava222.ordersystem.shop.product.Product;

import java.util.List;
import java.util.Objects;

public final class Order {

    private final int id;
    private final List<Product> products;

    public Order(
            int id,
            List<Product> products
    ) {
        this.id = id;
        this.products = products;
    }

    public int id() {
        return id;
    }

    public List<Product> products() {
        return products;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Order) obj;
        return this.id == that.id &&
                Objects.equals(this.products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }

    @Override
    public String toString() {
        return "Order[" +
                "id=" + id + ", " +
                "products=" + products + ']';
    }

}
