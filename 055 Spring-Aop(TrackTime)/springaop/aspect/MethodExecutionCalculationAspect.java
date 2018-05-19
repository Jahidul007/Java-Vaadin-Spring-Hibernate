package com.example.spring.aop.springaop.aspect;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// aop
// configuration 
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// what kind of calls i would intercept
	// execution (* package.*.*(..))
	// weaving and weaver 
	@Around("com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {	
		
		// startTime = x
		long startTime = System.currentTimeMillis();

		// allow execution of method 
		joinPoint.proceed();
		
		// endTime = y
		long takenTime = System.currentTimeMillis()- startTime ;
		
		logger.info("Time taken by {} is {} ",joinPoint,takenTime);
	}

}
