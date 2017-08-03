package com.systrangroup.factory.design.pattern.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		TranslatorProxy translatorProxy = new TranslatorProxy();
		translatorProxy.setContents("번역할 컨텐츠");
		System.out.println(translatorProxy.translate());
	}

}
