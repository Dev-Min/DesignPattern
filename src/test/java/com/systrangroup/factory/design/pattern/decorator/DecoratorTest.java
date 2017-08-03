package com.systrangroup.factory.design.pattern.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		Fruit apple = new Apple();
		System.out.println("Fruit : " + apple.getName());
		System.out.println("Cost : " + apple.cost());
		
		Shaker appleJuice = new AppleJuice(apple);
		System.out.println("Juice : " + appleJuice.getName());
		System.out.println("Cost : " + appleJuice.cost());
	}

}
