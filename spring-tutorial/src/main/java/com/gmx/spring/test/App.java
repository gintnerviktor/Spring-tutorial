package com.gmx.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gmx/spring/test/beans/beans.xml");
		
		Person person = (Person) context.getBean("person");
		
		person.setTaxId(6666);
		
		System.out.println(person);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
