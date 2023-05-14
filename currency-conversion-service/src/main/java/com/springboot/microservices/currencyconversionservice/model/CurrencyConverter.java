package com.springboot.microservices.currencyconversionservice.model;

import java.math.BigDecimal;

public class CurrencyConverter {

private Long id;
	
	private String from;
	
	private String to;

	private BigDecimal conversionMultiple;
	
	private Long quantity;
	
	private BigDecimal totalCalculatedAmount;


	public CurrencyConverter() {
		
	}
	
	public CurrencyConverter(Long id, String from, String to, BigDecimal conversionMultiple,Long quantity, BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity=quantity;
		this.totalCalculatedAmount=totalCalculatedAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
