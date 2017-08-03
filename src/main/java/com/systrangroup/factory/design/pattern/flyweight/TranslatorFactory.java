package com.systrangroup.factory.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TranslatorFactory {
	private Map<EngineKey, Translator> translators;
	
	public TranslatorFactory() {
		translators = new HashMap<EngineKey, Translator>();
	}
	
	public Translator get(EngineKey key) {
		Translator translator = translators.get(key);
		if(translator == null) {
			translator = new TranslateEngine();
			translator.setTranslateEngineType(key); 
			translators.put(key, translator);
		}
		
		return translator;
	}
}
