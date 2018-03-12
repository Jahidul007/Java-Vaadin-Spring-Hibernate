package com.example.maventest;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWriter {

	public void writer(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);

	}

}
