package com.springboot.microservices.currencyexchangeservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import com.springboot.microservices.currencyexchangeservice.model.CurrencyExchangeEntity;
import com.springboot.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Component
public class CurrencyExchangeDaoService {
	
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	@Autowired
	private Environment environment;
	
	public List<CurrencyExchangeEntity> findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency){
		List<CurrencyExchangeEntity>  currencyExchangeEntitys = currencyExchangeRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);

		currencyExchangeEntitys.forEach( currencyExchangeEntity ->
				currencyExchangeEntity.setEnvironment(environment.getProperty("local.server.port"))
		);
		
		return currencyExchangeEntitys;
		
	}
	
	public List<CurrencyExchangeEntity> findByFromCurrency(String fromCurrency){
		return currencyExchangeRepository.findByFromCurrency(fromCurrency);
	}


}
