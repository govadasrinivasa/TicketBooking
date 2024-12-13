package com.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.dto.TicketBookingDTO;
import com.ticketbooking.service.impl.TicketBookingServiceImpl;


@RestController
@RequestMapping("/tb")
public class TicketBookingController {

	@Autowired
	TicketBookingServiceImpl ticketBookingService;
	
	@PostMapping("/register")
	public void register(@RequestBody TicketBookingDTO ticketBookingDTO) {
		ticketBookingService.register(ticketBookingDTO);
		System.out.println();
	}
	
	@GetMapping("login/{id}")
	public TicketBookingDTO login(@PathVariable("username") String username, @PathVariable("password") String password) {
		//TicketBookingDTO ticketBookingDTO = ticketBookingService.getAccount(id);
		return null;
	}
}
