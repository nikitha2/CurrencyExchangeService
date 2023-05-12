package com.springboot.microservices.currencyexchangeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.microservices.currencyexchangeservice.model.CurrencyExchangeEntity;
import com.springboot.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Component
public class CurrencyExchangeDaoService {
	
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	
	public List<CurrencyExchangeEntity> findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency){
		return currencyExchangeRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
	}
	
	public List<CurrencyExchangeEntity> findByFromCurrency(String fromCurrency){
		return currencyExchangeRepository.findByFromCurrency(fromCurrency);
	}


}
