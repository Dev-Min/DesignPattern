package com.systrangroup.factory.design.pattern.facade;

public class Translator {
	public boolean serverConnect(String url) {
		// connection request
		System.out.println(url + " is connected");
		return true;
	}
	
	public String translate(String contents) {
		// call translate request 
		System.out.println("Start contents translation!");
		return "컨텐츠";
	}
}
