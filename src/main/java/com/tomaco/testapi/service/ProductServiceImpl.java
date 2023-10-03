package com.tomaco.testapi.service;

import com.tomaco.testapi.extension.ProductNotFoundException;
import com.tomaco.testapi.model.Product;
import com.tomaco.testapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Autowired
  public ProductServiceImpl (final ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product save(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product getProduct(Long id) {
    return this.productRepository.findById(id).orElseThrow(() ->
        new ProductNotFoundException("Product with Id: "+ id+ " not found", "getProduct() - Product")
    );
  }

  @Override
  public List<Product> gerAllProducts() {
    return this.productRepository.findAll();
  }
}
