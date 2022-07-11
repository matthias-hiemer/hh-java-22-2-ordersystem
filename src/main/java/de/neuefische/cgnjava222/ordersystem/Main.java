package de.neuefische.cgnjava222.ordersystem;

import de.neuefische.cgnjava222.ordersystem.shop.ShopService;
import de.neuefische.cgnjava222.ordersystem.shop.product.Product;
import de.neuefische.cgnjava222.ordersystem.shop.product.ProductRepo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        ShopService shopService = new ShopService(productRepo);

        Product product = shopService.getProduct(3);
        System.out.println(product);

        List<Product> products = shopService.listProducts();
        System.out.println(products);
    }
}
