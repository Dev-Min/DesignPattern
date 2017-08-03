package com.systrangroup.factory.design.pattern.proxy;

public class TranslatorProxy implements Translator{
	private String contents;
	private TranslateWorker translateWorker;
	
	public void setContents(String contents) {
		this.contents = contents;
	}

	public String translate() {
		translateWorker = new TranslateWorker(contents);
		return translateWorker.translate();
	}

}
