package com.adapter.example;

public class Center extends Player {

	public Center(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("�з� " + name + " ����");
	}

	@Override
	public void defense() {
		System.out.println("�з� " + name + " ����");
	}
}
