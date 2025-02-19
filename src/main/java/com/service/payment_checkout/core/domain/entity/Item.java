package com.service.payment_checkout.core.domain.entity;

import java.math.BigDecimal;

public record Item(
  Long id,
  String name,
  String description,
  BigDecimal unitValue,
  Long totalAmount
) {}
