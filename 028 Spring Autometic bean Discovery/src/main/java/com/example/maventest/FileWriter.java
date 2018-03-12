package com.example.maventest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("filewriter")
public class FileWriter implements LogWriter {

	public void writer(String text) {
		// TODO Auto-generated method stub
		System.out.println("Log to file: "+text);

	}

}
