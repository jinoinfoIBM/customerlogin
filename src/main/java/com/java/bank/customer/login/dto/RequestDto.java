package com.java.bank.customer.login.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {


	private String loginUserId;
	
	private String loginPwd;
	
}
