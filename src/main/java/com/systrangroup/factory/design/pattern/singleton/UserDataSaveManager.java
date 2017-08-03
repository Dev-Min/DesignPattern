package com.systrangroup.factory.design.pattern.singleton;

import java.util.List;

public class UserDataSaveManager {
	private static UserDataSaveManager instance;
	private UserDataSaver userDataSaver;

	private UserDataSaveManager(String appName) {
		// Need User Save File(or db) open..
		userDataSaver = new UserDataSaver(appName);
	}

	public static UserDataSaveManager getInstance(String appName) {
		// Double null check - more safety
		if (instance == null) {
			synchronized (UserDataSaveManager.class) {
				if (instance == null) {
					instance = new UserDataSaveManager(appName);
				}
			}
		}
		return instance;
	}
	
	public void setUserDataByKey(String key, String data) {
		userDataSaver.setUserDataByKey(key, data);
	}
	
	public List<String> getUserDataKeys() {
		return userDataSaver.getUserDataKeys();
	}
	
	public String getUserDataByKey(String key) {
		return userDataSaver.getUserDataByKey(key);
	}
}
