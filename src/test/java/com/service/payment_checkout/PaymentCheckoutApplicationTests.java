package com.service.payment_checkout;

import com.service.payment_checkout.core.domain.Item;
import com.service.payment_checkout.core.gateways.PersistenceGateway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class PaymentCheckoutApplicationTests {

	@Autowired
	private PersistenceGateway<Item> persistenceGateway;

	@Test
	void contextLoads() {
	}

	@Test
	void testItemSaveTxt() {
		Item item = new Item(1L, "testItem", new BigDecimal("10"));
		this.persistenceGateway.save(item);
	}

	@Test
	void readAllItems() {
		List<Item> result = this.persistenceGateway.getAll();
		System.out.println(result.toString());
	}

}
