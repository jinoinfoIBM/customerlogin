package com.java.bank.customer.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.bank.customer.login.dto.CustomerResponseDto;
import com.java.bank.customer.login.dto.RequestDto;
import com.java.bank.customer.login.service.CustomerLoginService;

@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerLoginController {

	@Autowired
	CustomerLoginService customerLoginService;

	@PostMapping("/v1/login")
	public ResponseEntity<CustomerResponseDto> getCustomerDetails(@RequestBody RequestDto requestDto) {

		CustomerResponseDto responseDto = customerLoginService.validateAndFetchCustomerDetails(requestDto);

		return new ResponseEntity<CustomerResponseDto>(responseDto, HttpStatus.OK);

	}
}
