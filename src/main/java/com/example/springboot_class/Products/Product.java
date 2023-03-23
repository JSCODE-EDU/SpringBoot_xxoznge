package com.example.springboot_class.Products;
import lombok.Getter;

@Getter
public class Product {
    private final String name;
    private final Long price;

    public Product(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public Long getPrice() {
        return price;
    }
}
