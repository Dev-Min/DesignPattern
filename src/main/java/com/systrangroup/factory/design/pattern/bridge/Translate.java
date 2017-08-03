package com.systrangroup.factory.design.pattern.bridge;

public class Translate implements Job {
	private String orgText;
	
	public Translate(String orgText) {
		this.orgText = orgText;
	}
	
	public String run() {
		// Call Translate Service
		String translateText = orgText + "_translate";
		return translateText;
	}
}
