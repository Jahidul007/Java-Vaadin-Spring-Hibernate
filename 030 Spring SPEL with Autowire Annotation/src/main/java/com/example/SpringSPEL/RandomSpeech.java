package com.example.SpringSPEL;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSpeech {
	public static String[] texts = { "i'll be back", 
			"Get out", 
			"I want your clothes, boots and motorcycle",
			"jahid is good boy",
			null
	};

	public String getTexts() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}


}
