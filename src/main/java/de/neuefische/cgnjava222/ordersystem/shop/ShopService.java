package de.neuefische.cgnjava222.ordersystem.shop;

import de.neuefische.cgnjava222.ordersystem.shop.product.Product;
import de.neuefische.cgnjava222.ordersystem.shop.product.ProductRepo;

import java.util.List;

public class ShopService {
    private final ProductRepo productRepo;

    public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product getProduct(int id) {
        return productRepo.getProduct(id);
    }

    public List<Product> listProducts() {
        return productRepo.listProducts();
    }
}
