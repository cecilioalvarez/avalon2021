package com.arquitecturajava.sql.product;

import java.util.List;

interface ProductRepository {
    Product select(Product product);
    List<Product> select();
    List<Product> select(String name);
    List<Product> select(double price);
    List<Product> select(String name, double price);
    int insert(Product product);
    int delete(Product product);
    int delete(String name);
    int delete(double price);
    int delete(String name, double price);
    int update(Product product);
    int updateName(Product product, String newValue);
    int updatePrice(Product product, double newValue);
}