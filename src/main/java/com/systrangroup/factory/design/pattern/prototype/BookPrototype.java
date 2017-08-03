package com.systrangroup.factory.design.pattern.prototype;

public abstract class BookPrototype implements Cloneable{
	@Override
	protected Book clone() throws CloneNotSupportedException {
		return (Book) super.clone();
	}
	
	public abstract void setBookName(String name);
	public abstract void setBindType(String type);
}
