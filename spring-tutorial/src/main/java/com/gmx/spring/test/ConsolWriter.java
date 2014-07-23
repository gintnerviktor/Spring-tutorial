package com.gmx.spring.test;

public class ConsolWriter implements LogWriter{

	public void write ( String text) {
		System.out.println(text);
	}
}
