package com.springboot.microservices.currencyexchangeservice.model;

import jakarta.persistence.Entity;

@Entity
public class CurrencyExchangeEntity {
	
	Long id;
	
	Long exchangeRate;
	
	String fromCurrency;
	
	String toCurrency;

}
