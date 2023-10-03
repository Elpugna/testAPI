package com.tomaco.testapi.service;

import com.tomaco.testapi.model.Product;

import java.util.List;

public interface ProductService {

  Product save(Product product);

  Product getProduct(Long id);

  List<Product> gerAllProducts();
}
