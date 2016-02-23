package com.adapter.example;

public class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ÖĞ·æ " + name + " ½ø¹¥");
	}

	@Override
	public void defense() {
		System.out.println("ÖĞ·æ " + name + " ·ÀÊØ");
	}
}
