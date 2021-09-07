package com.hjj.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author PC
 */
@Component
@Aspect
public class LogAspect3 {

	@Pointcut("execution(* com.hjj.service.impl..*.*(..))")
	public void pointCut(){

	}

	@Around("pointCut()")
	public Object around(ProceedingJoinPoint joinPoint){
		joinPoint.getSignature().getName();
		joinPoint.getArgs();
		Object proceed = null;
		try {
			System.out.println("前");
			proceed = joinPoint.proceed();
			System.out.println("后");
		} catch (Throwable e) {
			System.out.println("异常");
		}finally {
			System.out.println("返回值" + proceed);
		}
		return proceed;
	}
}
