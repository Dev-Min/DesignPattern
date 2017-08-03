package com.systrangroup.factory.design.pattern.facade;

public class SystranTranslator {
	public String startTranslate(String serverUrl, String filePath) {
		String result = "";
		Parser parser = new Parser();
		Translator translator = new Translator();
		String contents = parser.readDoc(filePath);
		String preProcessingContents = parser.preProcessing(contents);
		
		if (translator.serverConnect(serverUrl)) {
			String translateContents = translator.translate(preProcessingContents);
			result = parser.postProcessing(translateContents);
		}
		else {
			result = "Translation Server is Dead...";
		}
		
		return result;
	}
}
