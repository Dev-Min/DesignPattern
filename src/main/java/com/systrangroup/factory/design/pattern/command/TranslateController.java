package com.systrangroup.factory.design.pattern.command;

public class TranslateController {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public String startTranslate(String contents) {
		return command.translate(contents);
	}
}
