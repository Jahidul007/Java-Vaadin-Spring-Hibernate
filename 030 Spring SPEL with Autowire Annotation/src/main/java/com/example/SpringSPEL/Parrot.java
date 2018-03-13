package com.example.SpringSPEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String id;
	private String speech;
	public String getId() {
		return id;
	}
	@Autowired
	public void setId(@Value("#{randomSpeech.getTexts()?.length()}") String id) {
		this.id = id;
	}
	public String getSpeech() {
		return speech;
	}
	@Autowired
	public void setSpeech(@Value("#{randomSpeech.getTexts()}") String speech) {
		this.speech = speech;
	}
	
	public void speak() {
		System.out.println(id+":"+speech);
	}
	

}
