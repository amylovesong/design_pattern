package com.adapter.example;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ǰ�� " + name + " ����");
	}

	@Override
	public void defense() {
		System.out.println("ǰ�� " + name + " ����");
	}
}
