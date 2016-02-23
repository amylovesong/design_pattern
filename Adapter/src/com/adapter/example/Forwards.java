package com.adapter.example;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("Ç°·æ " + name + " ½ø¹¥");
	}

	@Override
	public void defense() {
		System.out.println("Ç°·æ " + name + " ·ÀÊØ");
	}
}
