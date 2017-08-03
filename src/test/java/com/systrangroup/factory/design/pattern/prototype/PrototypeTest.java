package com.systrangroup.factory.design.pattern.prototype;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void test() {
		BookBindery bindery = new BookBindery();
		try {
			bindery.bindBook("Head First Java", "Book", "Spring");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
