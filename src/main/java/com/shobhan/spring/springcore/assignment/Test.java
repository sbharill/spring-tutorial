package com.shobhan.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shobhan/spring/springcore/ref/refaspropertyconfig.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shobhan/spring/springcore/ref/refasattributeconfig.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shobhan/spring/springcore/assignment/refaspschemaconfig.xml");
		ShoppingCart sc = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(sc);
	}

}
