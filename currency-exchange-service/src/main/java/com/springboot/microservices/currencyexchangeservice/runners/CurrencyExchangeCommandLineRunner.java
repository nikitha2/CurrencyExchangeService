package com.springboot.microservices.currencyexchangeservice.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.microservices.currencyexchangeservice.model.CurrencyExchangeEntity;
import com.springboot.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

/**
 * CommandLineRunner: Used to run commands when application starts
 * @author Nikitha
 *
 */

@Component
public class CurrencyExchangeCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// Perform insert
		currencyExchangeRepository.save(new CurrencyExchangeEntity(65L,"USD","INR","TEST"));
		currencyExchangeRepository.save(new CurrencyExchangeEntity(80L,"EUR","INR","TEST"));
		currencyExchangeRepository.save(new CurrencyExchangeEntity(23L,"AUS","INR","TEST"));
		System.out.println("----------------------DB populated --------------------------");
	}

}
