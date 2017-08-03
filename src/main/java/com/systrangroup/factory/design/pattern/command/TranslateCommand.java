package com.systrangroup.factory.design.pattern.command;

public class TranslateCommand implements Command{
	private Translator translator;
	
	public TranslateCommand(Translator translator) {
		this.translator = translator;
	}

	public String translate(String contents) {
		return translator.translate(contents);
	}

}
