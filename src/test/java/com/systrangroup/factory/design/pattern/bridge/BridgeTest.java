package com.systrangroup.factory.design.pattern.bridge;

import org.junit.Test;

public class BridgeTest {

	@Test
	public void test() {
		Translate translate = new Translate("OrignalText");
		TranslateWorker translateWorker = new TranslateWorker(translate);
		String translateText = translateWorker.run();
		System.out.println(translateText);
	}

}
