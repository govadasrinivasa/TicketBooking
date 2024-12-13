package com.ticketbooking.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.ticketbooking.dto.TicketBookingDTO;
import com.ticketbooking.repository.TicketBookingRepository;
import com.ticketbooking.service.TicketBookingService;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {

	private final TicketBookingRepository ticketBookingRepo;
	
    private ModelMapper mapper;
	
	public TicketBookingServiceImpl(TicketBookingRepository ticketBookingRepo, ModelMapper mapper) {
		this.ticketBookingRepo = ticketBookingRepo;
		this.mapper = mapper;
	}

	@Override
	public void register(TicketBookingDTO ticketBookingDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TicketBookingDTO updateAccount(TicketBookingDTO ticketBookingDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
