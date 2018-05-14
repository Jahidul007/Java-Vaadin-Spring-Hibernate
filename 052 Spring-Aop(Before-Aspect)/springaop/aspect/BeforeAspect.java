package com.example.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// aop
// configuration 
@Aspect
@Configuration
public class BeforeAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// what kind of calls i would intercept
	// execution (* package.*.*(..))
	@Before("execution (* com.example.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		
		// what to do ?
		logger.info("Intercepted method calls{}",joinPoint);
	}

}
