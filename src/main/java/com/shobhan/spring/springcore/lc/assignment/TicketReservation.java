package com.shobhan.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int ticketId;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	@PostConstruct
	public void initlize() {
		System.out.println("Inside Initlize.");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside Clean Up.");
	}

	@Override
	public String toString() {
		return "TicketReservation [ticketId=" + ticketId + "]";
	}

}
