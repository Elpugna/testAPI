package com.tomaco.testapi.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductResDto {
  private String name;
  private double price;
  private long id;
}
