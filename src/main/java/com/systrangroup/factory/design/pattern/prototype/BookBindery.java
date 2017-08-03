package com.systrangroup.factory.design.pattern.prototype;

public class BookBindery {
	public void bindBook(String bookName, String bindType, String changeBindType) throws CloneNotSupportedException {
		Book orgBook = new Book(bookName, bindType);
		
		Book bindBook = orgBook.clone();
		bindBook.setBookName(bookName + "_copy");
		bindBook.setBindType(changeBindType);
		
		System.out.println("ORG BOOK : " + orgBook.toString());
		System.out.println("Bind BOOK : " + bindBook.toString());
	}
}
