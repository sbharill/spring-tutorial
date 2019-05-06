package com.shobhan.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/map/mapconfig.xml");
		Customer c = (Customer) context.getBean("customer");
		System.out.println(c.getId());
		System.out.println(c);
	}

}
