package com.adapter.example;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("���� " + name + " ����");
	}

	@Override
	public void defense() {
		System.out.println("���� " + name + " ����");
	}
}
