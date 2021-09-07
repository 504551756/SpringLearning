package com.hjj.aspects;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author PC
 */
@Component
@Aspect
public class LogAspect2 {

	@Pointcut("execution(* com.hjj.service.impl..*.*(..))")
	public void pointCut(){

	}

	@Before("pointCut() && @annotation(logger)")
	public void before(Logger logger){
		String name = logger.name();
		System.out.println(name);
	}

	@After(value = "pointCut()")

	@AfterThrowing("pointCut()")
	public void afterThrowing(){
	}

	@AfterReturning(value = "pointCut()", returning = "returnValue")
	public void afterReturning(JoinPoint joinPoint, Object returnValue){
	}
}
