package com.techtransactions.info.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ChanduAopCLASS {

	@Pointcut("execution(* com.techtransactions.info.bussiness.ChanduTechBussiness.*())")
	public void ss() {

	}

	@After("ss()")
	public void aroundMethod() {
		System.out.println("this is after annotation");
	}

	@Before("ss()")
	public void beforeMethod() {
		System.out.println("THIS IS BEFOREMETHOD");
	}
}
