package com.systrangroup.factory.design.pattern.composite;

public class File implements Node{
	private String name;
	private int size = 1;
	
	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	public void modifyFileName(String name) {
		this.name = name;
	}
}
