package com.adapter.example;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ºóÎÀ " + name + " ½ø¹¥");
	}

	@Override
	public void defense() {
		System.out.println("ºóÎÀ " + name + " ·ÀÊØ");
	}
}
