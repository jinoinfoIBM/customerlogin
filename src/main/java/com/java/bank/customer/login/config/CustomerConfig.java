package com.java.bank.customer.login.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;



@Configuration
public class CustomerConfig {


	@Value("${customer.bank.base.url}")
	private String customerBankBaseURL;

 @Bean	
 public WebClient webClient() {
	 
	 return WebClient.builder().baseUrl(customerBankBaseURL).build();
 }
}
