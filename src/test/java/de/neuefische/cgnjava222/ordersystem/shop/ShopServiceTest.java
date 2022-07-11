package de.neuefische.cgnjava222.ordersystem.shop;

import de.neuefische.cgnjava222.ordersystem.shop.product.Product;
import de.neuefische.cgnjava222.ordersystem.shop.product.ProductRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ShopServiceTest {

    @Test
    void getProduct() {
        //given
        ProductRepo productRepo = new ProductRepo();
        ShopService shopService = new ShopService(productRepo);

        //when
        Product actual = shopService.getProduct(2);

        //then
        assertThat(actual).isEqualTo(new Product(2, "Banane"));
    }

    @Test
    void listProducts() {
        //given
        ProductRepo productRepo = new ProductRepo();
        ShopService shopService = new ShopService(productRepo);

        //when
        List<Product> actual = shopService.listProducts();

        //then
        List<Product> expected = List.of(
                new Product(1, "Apfel"),
                new Product(2, "Banane"),
                new Product(3, "Zitrone"),
                new Product(4, "Mandarine")
        );
        assertThat(actual)
                .hasSameElementsAs(expected)
                .hasSize(expected.size());
    }
}
