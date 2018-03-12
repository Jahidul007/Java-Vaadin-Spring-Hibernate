package com.example.SpringSPEL;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private int id;
	private String speech;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpeech() {
		return speech;
	}
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	
	public void speak() {
		System.out.println(id+":"+speech);
	}
	

}
