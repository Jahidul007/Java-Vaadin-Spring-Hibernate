package com.example.spring.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//methods 
@Target(ElementType.METHOD)
//runtime 
@Retention(RetentionPolicy.RUNTIME)

public @interface TrackTime {

}
