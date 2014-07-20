package com.gmx.spring.test;

/**
 * @author viktor
 *
 */
public class Logger {
	private LogWriter consolwriter;
	private LogWriter filewriter;
	
	public void setConsolWriter(LogWriter consolwriter) {
		this.consolwriter = consolwriter;
	}

	/**
	 * setFileWriter
	 * A beanek-ben vigyázni kell az id ban található névre, mert a setFileWriter -> fileWriter lesz, azaz elmarad a set és a az első
	 * betű kis méretűre vált !!!
	 * @param filewriter
	 */
	public void setFileWriter(LogWriter filewriter) {
		this.filewriter = filewriter;
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
