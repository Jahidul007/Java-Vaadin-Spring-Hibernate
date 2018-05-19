package com.example.spring.aop.springaop.aspect;



import org.aspectj.lang.annotation.Pointcut;


public class CommonJoinPointConfig {

	@Pointcut("execution (* com.example.spring.aop.springaop.data.*.*(..))")
	public void dataLayoutException() {		
	}
	
	@Pointcut("execution (* com.example.spring.aop.springaop.business.*.*(..))")
	public void businessLayoutException() {		
	}
	
	@Pointcut("com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayoutException() && com.example.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayoutException() ")
	public void allLayerException() {
		
	}
	
	@Pointcut("bean(*dao*)")
	public void beanContainigDao() {
		
	}
	
	@Pointcut("execution (* com.example.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecutionWithWithin() {
		
	}

}
