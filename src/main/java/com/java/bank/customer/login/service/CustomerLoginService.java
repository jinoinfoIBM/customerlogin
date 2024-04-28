package com.java.bank.customer.login.service;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.java.bank.customer.login.dto.CustomerResponseDto;
import com.java.bank.customer.login.dto.RequestDto;

@Service
public class CustomerLoginService {

	public static final Logger logger = LoggerFactory.getLogger(CustomerLoginService.class);

	@Autowired
	private WebClient webClient;

	public CustomerResponseDto validateAndFetchCustomerDetails(RequestDto requestDto) {

		//ResponseDto responseDto = new ResponseDto();
		CustomerResponseDto customerResponseDto = new CustomerResponseDto();

		if (Objects.nonNull(requestDto.getLoginUserId()) && requestDto.getLoginUserId().equalsIgnoreCase("Jino")

				&& Objects.nonNull(requestDto.getLoginPwd()) && requestDto.getLoginPwd().equalsIgnoreCase("1234")) {

			logger.info("Sucessfully validated");

			customerResponseDto = webClient.get().uri("/customer/v1/customerDetails?customerId=10")
					.retrieve().bodyToMono(CustomerResponseDto.class).block();
			
			logger.info("Customer info from Customer bank {} ", customerResponseDto.toString());

			//responseDto.setResponseCode("200");
			//responseDto.setResponseMessage("Successful");
		}

		return customerResponseDto;

	}
}
