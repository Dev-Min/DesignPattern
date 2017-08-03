package com.systrangroup.factory.design.pattern.facade;

import org.junit.Test;

public class FacadeTest {

	@Test
	public void test() {
		SystranTranslator systranTranslator = new SystranTranslator();
		System.out.println(systranTranslator.startTranslate("192.168.0.11", "/User/test.doc"));
	}

}
