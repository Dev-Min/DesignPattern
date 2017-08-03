package com.systrangroup.factory.design.pattern.builder;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void test() {
		MemberShipCard memberShip1 = new MemberShipBuilder().setName("Hyungmin Park").setAge(30).setAddress("Korea").setPhoneNumber("010-1234-5678").build();
        MemberShipCard memberShip2 = new MemberShipBuilder().setName("Honggil Dong").setAge(40).build();
        System.out.println("member1 : " + memberShip1.getName());
        System.out.println("member2 : " + memberShip2.getName());
	}

}
