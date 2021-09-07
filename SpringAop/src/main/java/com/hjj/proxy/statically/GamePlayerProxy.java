package com.hjj.proxy.statically;

public class GamePlayerProxy implements IGamePlayer {
	private String name;

	private GamePlayer gamePlayer;

	public GamePlayerProxy(String name) {
		this.name = name;
		this.gamePlayer = new GamePlayer(name);
	}

	@Override
	public void start() {
		System.out.println("代理拿到" + name + "的账号");
		gamePlayer.start();
	}

	@Override
	public void play() {
		System.out.println("代理赢了");
	}
}
