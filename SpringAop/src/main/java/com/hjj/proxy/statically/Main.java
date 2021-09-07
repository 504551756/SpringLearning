package com.hjj.proxy.statically;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
//		静态代理
//		IGamePlayer gamePlayer = new GamePlayerProxy("xxx");
//		gamePlayer.start();
//		gamePlayer.play();


//      动态代理
		IGamePlayer gamePlayer = new GamePlayer("xxx");
		final Class<?>[] interfaces = {IGamePlayer.class};
		InvocationHandler h = getInvocationHandler(gamePlayer);
		IGamePlayer iGamePlayer = (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(), interfaces, h);
		iGamePlayer.start();
		iGamePlayer.play();
	}

	public static InvocationHandler getInvocationHandler(Object o) {
		return (proxy, method, args) -> {
			// 执行被代理方法
			if (method.getName().equals("start")) {
				System.out.println("代理拿到了账号");
				method.invoke(o, args);
			}
			if (method.getName().equals("play")) {
				System.out.println("代理赢了");
			}
			return null;
		};
	}
}
