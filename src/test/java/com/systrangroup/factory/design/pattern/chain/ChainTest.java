package com.systrangroup.factory.design.pattern.chain;

import org.junit.Test;

public class ChainTest {

	@Test
	public void test() {
		Basket basket, tempBasket;
		tempBasket = new SmallBasket(Basket.SMALL);
		basket = tempBasket;
		tempBasket = tempBasket.setNext(new MediumBasket(Basket.MEDIUM));
		tempBasket = tempBasket.setNext(new BigBasket(Basket.LARGE));

		// basket.shoot("SmallBall", Basket.SMALL);
		// basket.shoot("MediumBall", Basket.MEDIUM);
		basket.shoot("BigBall", Basket.LARGE);
	}

}
