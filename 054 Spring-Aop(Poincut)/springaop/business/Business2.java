package com.example.spring.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.aop.springaop.data.Dao2;

@Service
public class Business2 { 
	
	@Autowired
	private Dao2 dao2;
	public String calculateSomething() {
		
		// business logic is here
		return dao2.retrieveSomething();
		
	}

}
