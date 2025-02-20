package com.service.payment_checkout.infra.api.controller;

import java.net.URI;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.payment_checkout.core.domain.usecases.CheckoutCreationUseCase;
import com.service.payment_checkout.infra.api.dto.ItemDto;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

  private CheckoutCreationUseCase checkoutCreationUseCase;

  public CheckoutController(CheckoutCreationUseCase checkoutCreationUseCase) {
     this.checkoutCreationUseCase = checkoutCreationUseCase;
  }
  
  @PostMapping("/create")
  public ResponseEntity<?> createCheckout(@RequestBody ItemDto itemDto) {
    String result = this.checkoutCreationUseCase.createCheckout(itemDto.toItem());
    HashMap<String, String> response = new HashMap<>();
    response.put("checkout_url", result);
    return ResponseEntity.created(URI.create("")).body(response);
  }
}
