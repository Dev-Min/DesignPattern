package com.systrangroup.factory.design.pattern.decorator;

public abstract class Fruit {
	protected String name = "";
	
	public String getName() {
		return this.name;
	}
	
	public abstract int cost();
}
