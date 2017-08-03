package com.systrangroup.factory.design.pattern.prototype;

public class Book extends BookPrototype{
	private String bookName;
	private String bindType;
	
	public Book(String name, String bindType) {
		this.bookName = name;
		this.bindType = bindType;
	}
	
	@Override
	public void setBookName(String name) {
		this.bookName = name;
	}
	@Override
	public void setBindType(String type) {
		this.bindType = type;
	}
	@Override
	public String toString() {
		return "Book : " + bookName + " - BindType : " + bindType;
	}
}
