package com.example.maventest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;



public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private LogWriter fileWriter;


	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}
	@Resource(name="demofileWriter")
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}
	@Resource(name="whatever")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.writer(text);

	}

	public void writeFile(String text) {
		// TODO Auto-generated method stub
		fileWriter.writer(text);

	}

}
