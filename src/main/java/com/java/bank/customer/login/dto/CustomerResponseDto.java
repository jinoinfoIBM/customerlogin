package com.java.bank.customer.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponseDto{
	
	private String customerId;
	
	private String customerName;
	
	private String customerAddress;
	
	private String phoneNumber;
	
}