package com.decorator.example;

import android.util.Log;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void wearTShirts() {
		Log.d(Utils.TAG, "��T��");
	}

	public void wearBigTrouser() {
		Log.d(Utils.TAG, "���");
	}

	public void wearSneakers() {
		Log.d(Utils.TAG, "����Ь");
	}

	public void wearSuit() {
		Log.d(Utils.TAG, "��װ");
	}

	public void wearTie() {
		Log.d(Utils.TAG, "���");
	}

	public void wearLeatherShoes() {
		Log.d(Utils.TAG, "ƤЬ");
	}

	public void show() {
		Log.d(Utils.TAG, "װ���" + name);
	}
}
