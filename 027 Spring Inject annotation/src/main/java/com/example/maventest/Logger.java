package com.example.maventest;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;



public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private LogWriter fileWriter;


	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}
	@Inject
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}
	@Inject
	@Named(value="demo1")
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
	@PostConstruct
	public void init()
	{
		System.out.println("Creating bean");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroying bean");
	}

}
