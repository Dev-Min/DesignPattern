package com.systrangroup.factory.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Folder implements Node{
	private String name;
	private List<Node> childeNodes;
	
	public Folder(String name) {
		this.name = name;
		childeNodes = new ArrayList<Node>();
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return childeNodes.size();
	}

	public void modifyFileName(String name) {
		this.name = name;
	}

	public void add(Node node) {
		childeNodes.add(node);
	}
	
	public String getChildeNodes() {
		StringBuilder sb = new StringBuilder();
		if (!childeNodes.isEmpty()) {
			for(int i = 0; i < childeNodes.size(); i++) {
				Node node = childeNodes.get(i);
				sb.append(node.getName());
				if (i < childeNodes.size() - 1) {
					sb.append(", ");
				}
			}
			return sb.toString();
		}
		else {
			return "ChildeNodes is empty";
		}
	}
}
