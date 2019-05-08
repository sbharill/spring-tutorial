package com.shobhan.spring.springcore.singletonscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/singletonscope/configsingletonscope.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.hashCode());
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee2.hashCode());		
	}
}
