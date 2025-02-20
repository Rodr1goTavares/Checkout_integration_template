package com.service.payment_checkout.infra.api.dto;

import java.math.BigDecimal;

import com.service.payment_checkout.core.domain.entity.Item;

public record ItemDto(
    Long id,
    String name,
    String description,
    BigDecimal unitValue,
    long amount
) {
  public Item toItem() {
    return new Item(
      this.id(),
      this.name(),
      this.description(),
      this.unitValue(),
      this.amount()
    );
  }
}
