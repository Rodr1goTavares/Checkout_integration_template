package com.service.payment_checkout.infra.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.service.payment_checkout.core.domain.entity.Item;
import com.service.payment_checkout.core.gateways.CheckoutServiceGateway;

@Primary
@Service
public class FakeCheckoutService implements CheckoutServiceGateway {
  
  @Override
  public String sendCreationRequest(Item item) {
    return "https://fakecheckourt.com/checkout?id=" + item.id();
  }

}
