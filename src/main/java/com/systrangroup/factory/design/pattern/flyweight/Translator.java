package com.systrangroup.factory.design.pattern.flyweight;

public interface Translator {
	public void setTranslateEngineType(EngineKey key);
	public String translate(String contents);
}
