package com.tomaco.testapi.extension;

public class ProductNotFoundException extends RuntimeException {
  private static final long serialVersionUID = -7034897115124457333L;
  private final String debugPlace;

  public ProductNotFoundException(final String message, final String debugPlace) {
    super(message);
    this.debugPlace = debugPlace;
  }

  public String getResource() {
    return this.debugPlace;
  }
}