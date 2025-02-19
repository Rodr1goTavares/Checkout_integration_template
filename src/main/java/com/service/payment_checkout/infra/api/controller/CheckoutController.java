package com.service.payment_checkout.infra.api.controller;

import java.net.URI;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {
  
  @PostMapping("/create")
  public ResponseEntity<?> createCheckout() {
    HashMap<String, String> response = new HashMap<>();
    response.put("checkout_url", "");
    return ResponseEntity.created(URI.create("")).body(response);
  }
}
