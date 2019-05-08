package com.shobhan.spring.springcore.dependencycheck.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/dependencycheck/bean/config.xml");
		Priscription priscription = (Priscription) context.getBean("priscription");
		System.out.println(priscription);
	}
}
