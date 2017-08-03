package com.systrangroup.factory.design.pattern.command;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test() {
		TranslateController translateController = new TranslateController();
		Translator translator = new Translator();	// 번역기 생성
		TranslateCommand translateCommand = new TranslateCommand(translator);	// 번역을 수행 이벤트를 처리할 커맨드 생성 
		
		translateController.setCommand(translateCommand);
		System.out.println(translateController.startTranslate("번역 컨텐츠"));
	}

}
