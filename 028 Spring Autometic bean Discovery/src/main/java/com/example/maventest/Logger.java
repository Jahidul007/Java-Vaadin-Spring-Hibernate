package com.example.maventest;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class Logger {

	// @Autowired
	private ConsoleWriter consoleWriter;
	// @Autowired
	private LogWriter fileWriter;

	@Inject
	@Named(value="filewriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Inject
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public LogWriter getConsoleWriter() {
		return consoleWriter;
	}

	public void writeConsole(String text) {
		consoleWriter.writer(text);

	}

	public void writeFile(String text) {
		// TODO Auto-generated method stub
		fileWriter.writer(text);

	}

	@PostConstruct
	public void init() {
		System.out.println("Creating bean");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroying bean");
	}

}
