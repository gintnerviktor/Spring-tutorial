package com.gmx.spring.test;

public class Logger {
	private LogWriter consolwriter;
	private LogWriter filewriter;
	
	public void setConsolwriter(LogWriter consolwriter) {
		this.consolwriter = consolwriter;
	}

	public void setFilewriter(LogWriter filewriter) {
		this.filewriter = filewriter;
	}

	public void writeConsol(String text) {
		consolwriter.write(text);
	}
	
	public void writeFile(String text) {
		filewriter.write(text);
	}
}
