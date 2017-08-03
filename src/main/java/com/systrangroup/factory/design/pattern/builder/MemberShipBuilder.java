package com.systrangroup.factory.design.pattern.builder;

public class MemberShipBuilder {
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	
	public MemberShipBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public MemberShipBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public MemberShipBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public MemberShipBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public MemberShipCard build() {
		MemberShipCard memberShipCard = new MemberShipCard(name, age, address, phoneNumber);
		return memberShipCard;
	}
}
