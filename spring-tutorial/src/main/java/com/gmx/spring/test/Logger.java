package com.gmx.spring.test;

/**
 * @author viktor
 *
 */
public class Logger {
	private LogWriter consolwriter;
	private LogWriter filewriter;
	
	public Logger (ConsolWriter consolwriter, FileWriter filewriter) {
		this.consolwriter = consolwriter;
		this.filewriter =  filewriter;
	}

	/**
	 * 
	 * @param text
	 */
	public void writeConsol(String text) {
		consolwriter.write(text);
	}
	
	public void writeFile(String text) {
		filewriter.write(text);
	}
}
