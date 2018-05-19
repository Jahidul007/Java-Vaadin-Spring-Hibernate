package com.example.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Dao1 {
	
	public String retrieveSomething() {
		
		return "Dao1 is working here";
		
	}

}
