package com.shobhan.spring.springcore.dependencychecknscope.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/dependencychecknscope/assignment/config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);
		University university2 = (University) context.getBean("university");
		System.out.println(university2);		
	}
}
