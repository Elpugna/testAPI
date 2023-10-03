package com.tomaco.testapi.controller;

import com.tomaco.testapi.dto.Mapper;
import com.tomaco.testapi.dto.request.ProductReqDto;
import com.tomaco.testapi.dto.response.ProductResDto;
import com.tomaco.testapi.model.Product;
import com.tomaco.testapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/product"})
public class ProductController {

  @Autowired
  private final ProductService productService;

  public ProductController(final ProductService prodService) {
    this.productService = prodService;
  }


  @GetMapping("/{id}")
  public ResponseEntity<ProductResDto> getProductById(@PathVariable final long id){
    ProductResDto products = Mapper.productToProductResDto(productService.getProduct(id));
    return ResponseEntity.ok(products);
  }


  @GetMapping
  public ResponseEntity<List<ProductResDto>> getProduct(){
    List<ProductResDto> products = Mapper.productsToRESDto(productService.gerAllProducts());
    return ResponseEntity.ok(products);
  }

  @PostMapping
  public ResponseEntity<ProductResDto> createProduct(@RequestBody final ProductReqDto productReqDto) {
    Product p = Mapper.productReqToProduct(productReqDto);
    ProductResDto productResponse =  Mapper.productToProductResDto(productService.save(p));
    return ResponseEntity.ok(productResponse);
  }
}
