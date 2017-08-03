package com.systrangroup.factory.design.pattern.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.systrangroup.factory.design.pattern.flyweight.EngineKey;
import com.systrangroup.factory.design.pattern.flyweight.Translator;
import com.systrangroup.factory.design.pattern.flyweight.TranslatorFactory;

public class FlyweightTest {

	@Test
	public void test() {
		TranslatorFactory translateFactory = new TranslatorFactory();
		Translator enKoTranslator = translateFactory.get(EngineKey.enko);
		System.out.println(enKoTranslator.translate("번역할 컨텐츠"));
		
//		Translator enKoCopy = translateFactory.get(EngineKey.koen);
		Translator enKoCopy = translateFactory.get(EngineKey.enko);
		System.out.println(enKoTranslator.translate("번역할 컨텐츠"));
		
		assertEquals(enKoTranslator, enKoCopy);
	}

}
