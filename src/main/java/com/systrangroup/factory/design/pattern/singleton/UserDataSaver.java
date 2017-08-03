package com.systrangroup.factory.design.pattern.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDataSaver {
	private String appName;
	
	private List<String> userDataKeys;
	private Map<String, String> userDataMap;
	
	public UserDataSaver(String appName) {
		this.appName = appName;
		initData();
	}
	
	private void initData() {
		// Make Dummy
		userDataKeys = new ArrayList<String>();
		userDataMap = new HashMap<String, String>();
		
		userDataMap.put("userId", "systran");
		userDataMap.put("userPw", "1234");
		
		userDataKeys.add("userId");
		userDataKeys.add("userPw");
	}
	
	public String getUserDataByKey(String key) {
		if (!userDataMap.isEmpty()) {
			if(userDataMap.containsKey(key)) {
				return userDataMap.get(key);
			}
			else {
				return "Not Found Key!";
			}
		}
		else {
			return "User Data is Empty...";
		}
	}
	
	public void setUserDataByKey(String key, String data) {
		userDataMap.put(key, data);
	}
	
	public List<String> getUserDataKeys() {
		if (userDataKeys.isEmpty()) {
			return Collections.emptyList();
		}
		else {
			return userDataKeys;
		}
	}
}
