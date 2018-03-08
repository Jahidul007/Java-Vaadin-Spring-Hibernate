package com.example.maventest;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private FileWriter fileWriter;

	/*
	 * @Autowired public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter)
	 * {
	 * this.consoleWriter = consoleWriter; this.fileWriter = fileWriter; 
	 * }
	 */

	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	@Autowired
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
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
