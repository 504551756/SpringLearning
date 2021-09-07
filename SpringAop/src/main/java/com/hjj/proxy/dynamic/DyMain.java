package com.hjj.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DyMain {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		/*
		 * loader – 类加载器，通常是被代理接口的类加载器
		 * interfaces – 类型，通常是被代理的接口类型
		 * h – 委托执行的处理类：日志功能
		 */
		ClassLoader loader = ICalculator.class.getClassLoader();
		final Class<?>[] interfaces = {ICalculator.class};
		final ICalculator calculator = new Calculator();
		InvocationHandler h = getInvocationHandler(calculator);
		ICalculator iCalculator = (ICalculator) Proxy.newProxyInstance(loader, interfaces, h);
		System.out.println(iCalculator.getClass().getTypeName());
		int add = iCalculator.add(1, 1);
		System.out.println(add);
	}

	public static InvocationHandler getInvocationHandler(Object o) {
		return (proxy, method, args) -> {
			// 日志增强功能
			if (args != null ) {
				System.out.println("日志：参数是：" + Arrays.asList(args));
			}
			// 执行被代理方法
			Object result = method.invoke(o, args);
			System.out.println("结果" + result);
			return result;
		};
	}


}
