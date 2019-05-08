package com.shobhan.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/propertyplaceholder/config.xml");
		MyDAO mydao = (MyDAO) context.getBean("mydao");
		System.out.println(mydao.getDbServer());
	}
}
