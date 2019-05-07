package com.shobhan.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/lc/assignment/config.xml");
		context.registerShutdownHook();
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketReservation);
	}

}
