package com.systrangroup.factory.design.pattern.facade;

public class Parser {
	public String readDoc(String path) {
		System.out.println(path + " contents paring result : contents");
		return "contents";
	}
	
	public String preProcessing(String contents) {
		System.out.println("start PreProcessing!");
		return "preProcessing " + contents;
	}
	
	public String postProcessing(String contents) {
		System.out.println("start PostProcessing!");
		return contents + " postProcessing";
	}
}
