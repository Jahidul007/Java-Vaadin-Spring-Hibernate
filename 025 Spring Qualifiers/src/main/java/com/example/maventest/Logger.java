package com.example.maventest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private LogWriter fileWriter;


	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	@Autowired
	@Qualifier("consolewriter")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	@Qualifier("Filewriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String String) {
		// TODO Auto-generated method stub

		consoleWriter.writer(String);

	}

	public void writeFile(String text) {
		// TODO Auto-generated method stub
		fileWriter.writer(text);

	}

}
