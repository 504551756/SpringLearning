package com.hjj.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author PC
 */
@Aspect
@Component
public class LogAspect {

	/**
	 * execution 切点标识符
	 * 访问标识符 可以不写
	 * 返回值 *表示所有返回值
	 * 包名 ..表示包含子包
	 * 类名 *表示所有类（*Service）
	 * 方法名 *表示所有方法
	 * (..)/(Integer) 方法， ..表示任意多个方法
	 */
//	@Before("@annotation(jdk.nashorn.internal.runtime.logging.Logger)")
	@Before("execution(* com.hjj.service.impl..*.*(..)) && execution(* com.hjj.service.impl..*.*(..))")
	public void before(){
		System.out.println("前置通知");
	}

	@After(value = "execution(public com.hjj.model.User com.hjj.service.impl.UserServiceImpl.select(Integer))")
	public void after(){
		System.out.println("后置通知");
	}

	@AfterThrowing("execution(* com.hjj..*Service.*(..))")
	public void afterThrowing(){
		System.out.println("异常通知");
	}

	@AfterReturning(value = "execution(* com.hjj.controller..*.*(..))",
			returning = "returnValue")
	public void afterReturning(JoinPoint joinPoint, Object returnValue){
		// 方法名
		String name = joinPoint.getSignature().getName();
		System.out.println("方法名：" + name);
		// 参数
		Object[] args = joinPoint.getArgs();
		System.out.println(returnValue);
		System.out.println("返回通知");
	}
}
