package com.example.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Dao2 {
	
	public String retrieveSomething() {
		
		return "Dao2 is working";
		
	}

}
