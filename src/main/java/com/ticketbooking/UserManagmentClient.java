package com.ticketbooking;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ticketbooking.dto.UserManagementDTO;

@FeignClient(name="usermanagement", url="http://localhost:8091", path="/um")
public interface UserManagmentClient {

	@PostMapping("/register")
	public void register(@RequestBody UserManagementDTO userManagementDTO);
	
}
