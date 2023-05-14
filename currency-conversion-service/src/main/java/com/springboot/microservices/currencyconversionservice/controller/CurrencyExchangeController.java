package com.springboot.microservices.currencyconversionservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.microservices.currencyconversionservice.model.CurrencyExchange;
import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
		
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to,
			@PathVariable int quantity) {
		return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		
	}

}
