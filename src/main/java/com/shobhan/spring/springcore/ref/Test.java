package com.shobhan.spring.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shobhan/spring/springcore/ref/refaspropertyconfig.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shobhan/spring/springcore/ref/refasattributeconfig.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shobhan/spring/springcore/ref/refasattributeconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
