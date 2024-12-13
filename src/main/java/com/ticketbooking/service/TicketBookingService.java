package com.ticketbooking.service;

import com.ticketbooking.dto.TicketBookingDTO;

public interface TicketBookingService {

	void register(TicketBookingDTO ticketBookingDTO);
	TicketBookingDTO updateAccount(TicketBookingDTO ticketBookingDTO);
}
