package com.systrangroup.factory.design.pattern.decorator;

public class AppleJuice extends Shaker{
	private Fruit fruit;

	public AppleJuice(Fruit fruit) {
		this.fruit = fruit;
	}
	
	@Override
	public String getName() {
		return fruit.getName() + "주";
	}

	@Override
	public int cost() {
		return fruit.cost() + 500;
	}
	
}
