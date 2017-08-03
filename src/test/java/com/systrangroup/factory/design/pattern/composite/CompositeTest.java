package com.systrangroup.factory.design.pattern.composite;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void test() {
		Folder rootFolder = new Folder("root");
		File file1 = new File("file1");
		File file2 = new File("file2");
		rootFolder.add(file1);
		rootFolder.add(file2);
		System.out.println("root folder size is \"" + rootFolder.getSize() + "\" : " + rootFolder.getChildeNodes());
	}

}
