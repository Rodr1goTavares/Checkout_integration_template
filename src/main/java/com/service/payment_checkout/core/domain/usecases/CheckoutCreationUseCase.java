package com.service.payment_checkout.core.domain.usecases;

import com.service.payment_checkout.core.domain.entity.Item;
import com.service.payment_checkout.core.gateways.CheckoutServiceGateway;

public class CheckoutCreationUseCase {
  
  private final CheckoutServiceGateway checkoutServiceGateway;

  public CheckoutCreationUseCase(CheckoutServiceGateway checkoutServiceGateway) {
    this.checkoutServiceGateway = checkoutServiceGateway;
  }
  
  public String createCheckout(Item item) {
    return this.checkoutServiceGateway.sendCreationRequest(item);
  }

}
