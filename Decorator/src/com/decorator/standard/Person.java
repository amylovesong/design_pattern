package com.decorator.standard;

import android.util.Log;

import com.decorator.example.Utils;

public class Person {
	public Person() {
		Log.d(Utils.TAG, "Person()");
	}

	private String name;

	public Person(String name) {
		this.name = name;
		Log.d(Utils.TAG, "Person(String name)");
	}

	public void show() {
		Log.d(Utils.TAG, "×°°çµÄ£º" + name);
	}
}
