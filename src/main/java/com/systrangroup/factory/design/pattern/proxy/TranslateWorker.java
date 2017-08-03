package com.systrangroup.factory.design.pattern.proxy;

public class TranslateWorker implements Translator {
	private String contents;
	
	public TranslateWorker(String contents) {
		prefixContents(contents);
	}
	
	private void prefixContents(String contents) {
		// 전처리 및 컨텐츠에 따른 처리 분기 추가 
		this.contents = contents;
	}

	public String translate() {
		return "번역된 컨텐츠";
	}

}
