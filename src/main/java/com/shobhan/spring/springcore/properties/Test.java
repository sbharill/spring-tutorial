package com.shobhan.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shobhan/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLangs cnl = (CountriesAndLangs) context.getBean("countriesandlangs");
		System.out.println(cnl.getCountriesAndLangs());
		System.out.println(cnl);
	}

}
