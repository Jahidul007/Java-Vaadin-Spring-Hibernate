package com.example.maventest;

public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeConsole(String String) {
		// TODO Auto-generated method stub
		consoleWriter.writer(String);

	}

	public void writeFile(String String) {
		// TODO Auto-generated method stub
		fileWriter.writer(String);

	}

}
