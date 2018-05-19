package com.example.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// aop
// configuration 
@Aspect
@Configuration
public class AfterAopAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// what kind of calls i would intercept
	// execution (* package.*.*(..))
	// weaving and weaver 
	@AfterReturning(
			value="com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayoutException()",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {	
		logger.info("{} returned with value{} ",joinPoint,result);
	}
	
	@After(
			value="com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayoutException()"
			
			)
	public void after(JoinPoint joinPoint) {	
		logger.info("after execution of {} ",joinPoint);
	}

}
