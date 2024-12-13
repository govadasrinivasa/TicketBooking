package com.ticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketbooking.entity.TicketBooking;

public interface TicketBookingRepository extends JpaRepository<TicketBooking, Long> {

	//List<Account> findAccount(Long Id);
}
