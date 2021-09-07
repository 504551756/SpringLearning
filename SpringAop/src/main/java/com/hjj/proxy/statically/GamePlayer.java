package com.hjj.proxy.statically;

public class GamePlayer implements IGamePlayer{
	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println(name + "登录游戏");
	}

	@Override
	public void play() {
		System.out.println(name + "被击杀");
	}
}
