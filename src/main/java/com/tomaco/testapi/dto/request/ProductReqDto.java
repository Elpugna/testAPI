package com.tomaco.testapi.dto.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Setter
@Getter
@NoArgsConstructor
public class ProductReqDto {
  @NotNull( message = "The product Id must be in the request body" )
  @Positive( message = "The productId must be provided" )
  private Long id;

  @NotNull( message = "The product name must be in the request body" )
  private String name;
  @NotNull( message = "The product price  must be in the request body" )
  @Min( value = 0L, message = "The price must be greater or equal than 0")
  private Double price;

  public ProductReqDto( Long id, Double price, String name ) {
    this.id = id;
    this.price = price;
    this.name  = name;
  }
}
