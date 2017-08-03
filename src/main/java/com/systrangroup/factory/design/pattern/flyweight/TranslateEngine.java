package com.systrangroup.factory.design.pattern.flyweight;

public class TranslateEngine implements Translator{
	private EngineKey engineKey;

	public String translate(String contents) {
		return engineKey.toString() + " 번역된 결과입니다";
	}

	public void setTranslateEngineType(EngineKey key) {
		engineKey = key;
	}

}
