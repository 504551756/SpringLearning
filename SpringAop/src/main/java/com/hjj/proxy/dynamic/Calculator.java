package com.hjj.proxy.dynamic;

public class Calculator implements ICalculator {

	public Calculator() {
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
