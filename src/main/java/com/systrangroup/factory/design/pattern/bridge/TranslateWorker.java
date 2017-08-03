package com.systrangroup.factory.design.pattern.bridge;

public class TranslateWorker implements Worker{
	private Translate translate;
	
	public TranslateWorker(Translate translate) {
		this.translate = translate;
	}

	public String run() {
		return translate.run();
	}

}
