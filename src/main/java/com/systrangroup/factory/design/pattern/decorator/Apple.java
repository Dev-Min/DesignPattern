package com.systrangroup.factory.design.pattern.decorator;

public class Apple extends Fruit{
	
	public Apple() {
		this.name = "사과";
	}

	@Override
	public int cost() {
		return 500;
	}
}
