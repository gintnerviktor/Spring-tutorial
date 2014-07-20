package com.gmx.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gmx/spring/test/beans/beans.xml");
		
		Logger logger = (Logger) context.getBean("logger");
		
		logger.writeConsol("Hello Consol !");
		logger.writeFile("Hello File!");
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
