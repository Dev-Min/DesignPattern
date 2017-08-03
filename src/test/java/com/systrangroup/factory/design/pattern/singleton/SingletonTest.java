package com.systrangroup.factory.design.pattern.singleton;

import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void getUserDataKeysTest() {
		for(String key : UserDataSaveManager.getInstance("").getUserDataKeys()) {
			System.out.println(key);
		}
	}
	
	@Test
	public void getUserDataByKeyTest() {
		System.out.println(UserDataSaveManager.getInstance("").getUserDataByKey("userId"));
		System.out.println(UserDataSaveManager.getInstance("").getUserDataByKey("ID"));
	}
}
