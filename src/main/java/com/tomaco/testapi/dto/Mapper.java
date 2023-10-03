package com.tomaco.testapi.dto;

import com.tomaco.testapi.dto.request.ProductReqDto;
import com.tomaco.testapi.dto.response.ProductResDto;
import com.tomaco.testapi.model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mapper {
  private Mapper() {

  }

  public static ProductResDto productToProductResDto(final Product product) {
    ProductResDto prod = new ProductResDto();
    prod.setName(product.getName());
    prod.setId(product.getId());
    prod.setPrice(product.getPrice());

    return prod;
  }

  public static Product productReqToProduct(final ProductReqDto productReqDto){

    Product prod = new Product(productReqDto.getName(), productReqDto.getPrice());
    prod.setName(productReqDto.getName());
    prod.setId(productReqDto.getId());
    prod.setPrice(productReqDto.getPrice());

    return prod;
  }

  public static List<ProductResDto> productsToRESDto (final List<Product> products ){
    List<ProductResDto> productList = new ArrayList();
    Iterator var2 = products.iterator();

    while(var2.hasNext()){
      Product p = (Product) var2.next();
      productList.add(productToProductResDto(p));
    }
    return productList;
  }
}
