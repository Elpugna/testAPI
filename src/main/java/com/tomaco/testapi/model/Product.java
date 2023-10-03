package com.tomaco.testapi.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;


@NoArgsConstructor
@Entity
@Table(name="Products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "The name is required for persistance")
  private String name;

  @NotNull(message = "The price is required for persistance")
  private Double price;

  public Product(final String name, final Double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }else if (o instanceof  Product) {
      Product that = (Product)o;
      return Objects.equals(this.id, that.getId());
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getId());
  }

  public Long getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  public Double getPrice() {
    return this.price;
  }

  public void setId(final Long id) {
    this.id = id;
  }
  public void setName(final String name) {
    this.name = name;
  }
  public void setPrice(final Double price) {
    this.price = price;
  }
}
