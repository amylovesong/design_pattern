package com.decorator.example;

import android.util.Log;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void wearTShirts() {
		Log.d(Utils.TAG, "大T恤");
	}

	public void wearBigTrouser() {
		Log.d(Utils.TAG, "垮裤");
	}

	public void wearSneakers() {
		Log.d(Utils.TAG, "破球鞋");
	}

	public void wearSuit() {
		Log.d(Utils.TAG, "西装");
	}

	public void wearTie() {
		Log.d(Utils.TAG, "领带");
	}

	public void wearLeatherShoes() {
		Log.d(Utils.TAG, "皮鞋");
	}

	public void show() {
		Log.d(Utils.TAG, "装扮的" + name);
	}
}
