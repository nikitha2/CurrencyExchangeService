package com.springboot.microservices.currencyexchangeservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class CurrencyExchangeEntity {
	@Id
	@GeneratedValue
	Long id;
	
	Long converstionMultiple;
	
	@Size(min = 2, message = "fromCurrency should be atleast 2 characters")
	@JsonProperty("from")
	String fromCurrency;
	
	@Size(min = 2, message = "toCurrency should be atleast 2 characters")
	@JsonProperty("to")
	String toCurrency;
	
	String environment;

	public CurrencyExchangeEntity(Long exchangeRate,
			@Size(min = 2, message = "fromCurrency should be atleast 2 characters") String fromCurrency,
			@Size(min = 2, message = "toCurrency should be atleast 2 characters") String toCurrency,
			String environment) {
		super();
		this.converstionMultiple = exchangeRate;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.environment = environment;
	}
	
	public CurrencyExchangeEntity() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getConverstionMultiple() {
		return converstionMultiple;
	}

	public void setConverstionMultiple(Long converstionMultiple) {
		this.converstionMultiple = converstionMultiple;
	}

	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	
}
