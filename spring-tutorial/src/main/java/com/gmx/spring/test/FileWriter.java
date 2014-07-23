package com.gmx.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("citrom")
public class FileWriter implements LogWriter{
	
	public void write ( String text) {
		System.out.println(text);
	}
}
