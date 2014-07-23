package com.gmx.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	
	private ConsolWriter consolwriter;
	private LogWriter filewriter;
	
	@Autowired
	@Qualifier("egyedi")
	public void setConsolWriter(ConsolWriter alma) {
		this.consolwriter = alma;
	}

	@Autowired
	@Qualifier("citrom")
	public void setFileWriter(LogWriter banan) {
		this.filewriter = banan;
	}

	public void writeConsol(String text) {
		consolwriter.write(text);
	}
	
	public void writeFile(String text) {
		filewriter.write(text);
	}
}
