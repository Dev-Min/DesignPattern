package com.systrangroup.factory.design.pattern.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void test() {
		FileParser parser = new FileParser();
		System.out.println(parser.read("doc", "documentDOC"));
		System.out.println(parser.read("pdf", "documentPDF"));
		System.out.println(parser.read("txt", "documentTXT"));
	}

}
