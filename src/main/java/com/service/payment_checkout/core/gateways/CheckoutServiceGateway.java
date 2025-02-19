package com.service.payment_checkout.core.gateways;

import com.service.payment_checkout.core.domain.entity.Item;

public interface CheckoutServiceGateway {

  String sendCreationRequest(Item item);
  
}
