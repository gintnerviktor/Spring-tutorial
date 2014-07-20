package com.gmx.spring.test;

public class Logger {
	private ConsolWriter consolwriter;
	private FileWriter filewriter;
	
	public void setConsolwriter(ConsolWriter consolwriter) {
		this.consolwriter = consolwriter;
	}

	public void setFilewriter(FileWriter filewriter) {
		this.filewriter = filewriter;
	}

	public void writeConsol(String text) {
		consolwriter.write(text);
	}
	
	public void writeFile(String text) {
		filewriter.write(text);
	}
}
