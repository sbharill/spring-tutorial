package com.shobhan.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/lc/interfaces/config.xml");
		context.registerShutdownHook();
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
	}

}
