package com.gmx.spring.test;

public class FileWriter implements LogWriter{
	
	public void write ( String text) {
		System.out.println(text);
	}
}
