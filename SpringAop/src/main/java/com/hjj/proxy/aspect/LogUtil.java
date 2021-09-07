package com.hjj.proxy.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Member;

@Aspect
@Component
public class LogUtil {

	@Before("execution(* com.hjj.proxy.service..*.*(..))")
	public static void before(){
		System.out.println("方法前");
	}

	public static void after(Member member, Object[] args){

	}

	public static void afterException(Member member, Object[] args){

	}

	public static void afterReturn(Member member, Object[] args){

	}
}
